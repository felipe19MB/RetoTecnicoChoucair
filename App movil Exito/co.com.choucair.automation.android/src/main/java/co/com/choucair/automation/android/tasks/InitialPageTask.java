package co.com.choucair.automation.android.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.logging.Logger;

import static co.com.choucair.automation.android.userinterface.InitialPage.BTNREGISTER;

public class InitialPageTask implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        Logger.getAnonymousLogger().info("Se abre App de Exito");
        actor.attemptsTo(
                Click.on(BTNREGISTER)
        );
    }

    public static InitialPageTask register(){

        return Tasks.instrumented(InitialPageTask.class);
    }


}
