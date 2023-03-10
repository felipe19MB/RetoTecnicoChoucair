package retotecnicochoucair.tasks;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static retotecnicochoucair.util.Constantes.*;

public class Get implements Task {


    private String endPoint;

    public Get(String endPoint) {
        this.endPoint = endPoint;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        int i = 0;
        int statusCode = 0;
        while (i < NUMERO_MAXIMO_REINTENTOS && statusCode != 200) {
            try{

                actor.whoCan(CallAnApi.at(URI_API));
            actor.attemptsTo(
                    net.serenitybdd.screenplay.rest.interactions.Get.resource(endPoint));
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
    public static Get consulta(String endPoint){
        return Tasks.instrumented(Get.class, endPoint);
    }
}
