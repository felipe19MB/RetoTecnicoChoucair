package co.com.choucair.retotecnico.exitoweb.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {
    public static final Target FINAL_PRICE = Target.the("Final price of products")
            .locatedBy("//td[@class='monetary exito-checkout-monetary']");

    public static final Target NAME_PRODUCT_FINAL = Target.the("Product name final")
            .locatedBy("//a[@class='exito-checkout-product-name']");

}
