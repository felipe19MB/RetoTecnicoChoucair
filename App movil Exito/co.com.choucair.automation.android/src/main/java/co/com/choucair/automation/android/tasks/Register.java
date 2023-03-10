package co.com.choucair.automation.android.tasks;

import co.com.choucair.automation.android.interactions.Coordinates;
import co.com.choucair.automation.android.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.choucair.automation.android.userinterface.RegisterPage.*;

public class Register implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Juanito").into(NOMBRES),
                Enter.theValue("Perez").into(APELLIDOS),
                Enter.theValue("C.C").into(TIPODOCUMENTO),
                Enter.theValue("123456789").into(DOCUEMENTO),

                Click.on(ANIONACIMIENTO),
                Enter.theValue("1995").into(ANIONACIMIENTO),
                Click.on(MESNACIMIENTO),
                Enter.theValue("08").into(MESNACIMIENTO),
                Click.on(DIANACIMIENTO),
                Enter.theValue("27").into(DIANACIMIENTO),
                Enter.theValue("3053352057").into(CELULAR),
                Enter.theValue("juanito@correo.com").into(EMAIL),
                Coordinates.guideCoordinates(88,1574),
                Coordinates.guideCoordinates(88,1706),
                Click.on(BTNCONFIRMAR)

        );
    }

    public static Register registerDates(){

        return Tasks.instrumented(Register.class);
    }
}
