package co.com.choucair.automation.android.tasks;

import co.com.choucair.automation.android.interactions.Coordinates;
import co.com.choucair.automation.android.interactions.Wait;
import co.com.choucair.automation.android.userinterface.ProductSelectPage;

import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Alert;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class ProductSelect implements Task {
    String titleProduct;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductSelectPage.NOTIFICATION),
                Wait.unMomento(5),
                Coordinates.guideCoordinates(893,1204),
                Click.on(ProductSelectPage.SEARCHER),
                WaitUntil.the(ProductSelectPage.DELIVERY,isClickable()).forNoMoreThan(5).seconds(),
                Click.on(ProductSelectPage.DELIVERY),
                WaitUntil.the(ProductSelectPage.BTNCONTINUE,isClickable()).forNoMoreThan(5).seconds(),
                Click.on(ProductSelectPage.BTNCONTINUE),
                Enter.theValue("Televisor Samsung").into(ProductSelectPage.SEARCHERII),
                Click.on(ProductSelectPage.BTNSEARCHER),
                WaitUntil.the(ProductSelectPage.TITTLEPRDUCT,isClickable()).forNoMoreThan(5).seconds(),
                Wait.unMomento(4)
                );
        titleProduct= ProductSelectPage.TITTLEPRDUCT.resolveFor(actor).getText();
        actor.remember("title product", titleProduct);
        System.out.println(titleProduct);

        actor.attemptsTo(
                WaitUntil.the(ProductSelectPage.ADDPRODUCT,isClickable()).forNoMoreThan(5).seconds(),
                Click.on(ProductSelectPage.ADDPRODUCT),
                WaitUntil.the(ProductSelectPage.SHOPCAR,isClickable()).forNoMoreThan(5).seconds(),
                Click.on(ProductSelectPage.SHOPCAR)

        );
    }

    public static ProductSelect pruductSelect(){
        return Tasks.instrumented(ProductSelect.class);
    }
}
