package co.com.choucair.automation.android.tasks;

import co.com.choucair.automation.android.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class Login implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("sato.d.95@gmail.com").into(LoginPage.EMAIL),
                Enter.theValue("Exito2023").into(LoginPage.PASSWORD),
                WaitUntil.the(LoginPage.BTNINGRESAR, isClickable()).forNoMoreThan(5).seconds(),
                Click.on(LoginPage.BTNINGRESAR)
        );
    }

    public static Login registerDates(){

        return Tasks.instrumented(Login.class);
    }
}
