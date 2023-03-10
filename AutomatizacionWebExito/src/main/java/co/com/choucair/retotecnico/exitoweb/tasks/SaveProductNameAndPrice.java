package co.com.choucair.retotecnico.exitoweb.tasks;

import co.com.choucair.retotecnico.exitoweb.userinterface.ExitoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SaveProductNameAndPrice implements Task {
    String title;
    Integer currentPrice;

    @Override
    public <T extends Actor> void performAs(T actor) {
        title = ExitoPage.TITLE_OF_PRODUCT.resolveFor(actor).getText();
        currentPrice = Integer.valueOf(ExitoPage.PRICE_TEXT.resolveFor(actor).getText().replace("$", "")
                .replace(".", "")
                .replace(" ", ""));
        actor.remember("productTitle", title);
        actor.remember("productPrice", currentPrice);
        System.out.println(title);
    }

    public static SaveProductNameAndPrice onActor() {
        return Tasks.instrumented(SaveProductNameAndPrice.class);
    }
}
