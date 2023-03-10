package co.com.choucair.automation.android.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.logging.Logger;

import static co.com.choucair.automation.android.userinterface.InitialPage.BTNREGISTER;

public class OpenThe implements Task {

    public OpenThe(){
    }

    public static OpenThe exitoApp(){
        return Tasks.instrumented(OpenThe.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
