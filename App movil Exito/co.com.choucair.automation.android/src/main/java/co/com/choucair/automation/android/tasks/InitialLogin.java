package co.com.choucair.automation.android.tasks;

import co.com.choucair.automation.android.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.automation.android.userinterface.InitialPage.BTNINGRESAR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class InitialLogin implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTNINGRESAR)
        );

    }

    public static InitialLogin enterLogin(){

        return Tasks.instrumented(InitialLogin.class);
    }
}
