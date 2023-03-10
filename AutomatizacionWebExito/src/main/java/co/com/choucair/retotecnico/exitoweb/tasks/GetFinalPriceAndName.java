package co.com.choucair.retotecnico.exitoweb.tasks;

import co.com.choucair.retotecnico.exitoweb.userinterface.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.choucair.retotecnico.exitoweb.userinterface.CartPage.FINAL_PRICE;


public class GetFinalPriceAndName implements Task {
    Integer price;
    String nameProductFinal;

    @Override
    public <T extends Actor> void performAs(T actor) {
        price = Integer.valueOf(FINAL_PRICE.resolveFor(actor).getText().replace("$", "")
                .replace(".", "")
                .replace(" ", ""));
        actor.remember("productFinalPrice", price);

        nameProductFinal= CartPage.NAME_PRODUCT_FINAL.resolveFor(actor).getText();
        actor.remember("nameFinal",nameProductFinal);

        System.out.println(nameProductFinal);
    }


    public static GetFinalPriceAndName method() {
        return Tasks.instrumented(GetFinalPriceAndName.class);
    }
}
