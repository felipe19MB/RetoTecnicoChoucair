package co.com.choucair.automation.android.tasks;

import co.com.choucair.automation.android.interactions.Wait;
import co.com.choucair.automation.android.userinterface.ProductSelectPage;
import co.com.choucair.automation.android.userinterface.ShopCarPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class ShopCar implements Task {
    String titleProductCar;
    @Override
    public <T extends Actor> void performAs(T actor) {
        Wait.unMomento(4);
        titleProductCar= ShopCarPage.TITLEPRODUCTCAR.resolveFor(actor).getText();
        actor.remember("title product car", titleProductCar);
        System.out.println(titleProductCar);
    }

    public static ShopCar productCar() {
        return Tasks.instrumented(ShopCar.class);
    }
}
