package co.com.choucair.retotecnico.exitoweb.tasks;

import co.com.choucair.retotecnico.exitoweb.userinterface.ExitoPage;
import co.com.choucair.retotecnico.exitoweb.utils.ReturnRandomAmount;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddRandomAmountOfProducts implements Task {
    int max;
    int min;
    String quantity;
    AddRandomAmountOfProducts(int max, int min) {
        this.max = max;
        this.min = min;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int totalItems = ReturnRandomAmount.getRandomIntInARange(1, 9);
        for (int i = 0; i < totalItems; i++) {
            actor.attemptsTo(
                    Click.on(ExitoPage.PLUS_SYMBOL_BTN)
            );
        }
        quantity = String.valueOf(ExitoPage.QUANTITY_TEXT.resolveFor(actor).getText().charAt(0));
        actor.remember("quantity", Integer.valueOf(quantity));
    }

    public static AddRandomAmountOfProducts betweenARange(int max, int min) {
        return Tasks.instrumented(AddRandomAmountOfProducts.class, max, min);
    }

}
