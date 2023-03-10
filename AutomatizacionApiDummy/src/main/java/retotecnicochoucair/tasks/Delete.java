package retotecnicochoucair.tasks;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static retotecnicochoucair.util.Constantes.*;

public class Delete implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        int i = 0;
        int statusCode = 0;
        while (i < NUMERO_MAXIMO_REINTENTOS && statusCode != 200) {
            try{
        actor.whoCan(CallAnApi.at(URI_API));
        actor.attemptsTo(
                net.serenitybdd.screenplay.rest.interactions.Delete.from(DELETE));
        statusCode = SerenityRest.lastResponse().statusCode();
        i++;
        if (statusCode != 200) {
            Thread.sleep(INTERVALO);
        }
    } catch (InterruptedException e){
        e.printStackTrace();
    }


}

    }

    public static Delete borrar(){
        return Tasks.instrumented(Delete.class);
    }
}
