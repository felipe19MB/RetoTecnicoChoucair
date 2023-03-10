package co.com.choucair.automation.android.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateProduct implements Question {

    String titleFinal;
    String tittle;
    @Override
    public Object answeredBy(Actor actor) {
        tittle=actor.recall("title product");
        titleFinal=actor.recall("title product");
        return tittle.equals(titleFinal);
    }

    public static ValidateProduct validateProd(){
        return  new ValidateProduct();
    }
}
