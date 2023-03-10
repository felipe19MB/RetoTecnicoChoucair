package retotecnicochoucair.tasks;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import retotecnicochoucair.model.Data;


import static retotecnicochoucair.util.Constantes.*;

public class Put implements Task {

    private final Data body;

    public Put(Data body) {
        this.body = body;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.whoCan(CallAnApi.at(URI_API));
        int i = 0;
        int statusCode = 0;
        while (i < NUMERO_MAXIMO_REINTENTOS && statusCode != 200) {
            try{
        actor.attemptsTo(
                net.serenitybdd.screenplay.rest.interactions.Put.to(UPDATE).with(
                        requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .body(body)
                )
        );statusCode = SerenityRest.lastResponse().statusCode();
        i++;
        if (statusCode != 200) {
            Thread.sleep(INTERVALO);
        }
    } catch (InterruptedException e){
        e.printStackTrace();
    }
}
    }

    public static Performable actualiza(Data body){
        return Tasks.instrumented(Put.class, body);
    }
}
