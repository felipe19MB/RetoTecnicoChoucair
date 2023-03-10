package co.com.choucair.retotecnico.exitoweb.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CompareNameProduct implements Question {
    String nameProductFinal;
    String nameProduct;

    @Override
    public Boolean answeredBy(Actor actor) {
       nameProduct = actor.recall("productTitle");
        nameProductFinal = actor.recall("nameFinal");
         return nameProduct.equals(nameProductFinal);
        }

    public static CompareNameProduct isOk() {
        return new CompareNameProduct();
    }
}

