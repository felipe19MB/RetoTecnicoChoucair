package stepdefinitions;

import co.com.choucair.retotecnico.exitoweb.interations.Wait;
import co.com.choucair.retotecnico.exitoweb.questions.CompareNameProduct;
import co.com.choucair.retotecnico.exitoweb.questions.ComparePrices;
import co.com.choucair.retotecnico.exitoweb.tasks.GetFinalPriceAndName;
import co.com.choucair.retotecnico.exitoweb.tasks.SaveProductNameAndPrice;
import co.com.choucair.retotecnico.exitoweb.tasks.AddRandomAmountOfProducts;
import co.com.choucair.retotecnico.exitoweb.userinterface.ExitoPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static co.com.choucair.retotecnico.exitoweb.userinterface.ExitoPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ExitoStepDefinitions {

    @Managed
    private WebDriver driver;

    @Before
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("actor");
    }
    @Given("The user enters page and select a {string} and {string}")
    public void theUserEntersPageAndSelectAAnd(String categoria, String subcategoria) {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                Open.url("https://www.exito.com/"),
                Click.on(ExitoPage.DROPDOWN),
                Click.on(ExitoPage.CATEGORIES.of(categoria)),
                Click.on(ExitoPage.SUBCATEGORIES.of(subcategoria)),
                Wait.unMomento(5),
                Click.on(ExitoPage.PRODUCTS),
                SaveProductNameAndPrice.onActor()

        );
    }
    @When("The user selects a random product and take between {int} and {int} of it")
    public void theUserSelectsARandomProductAndTakeBetweenAndOfIt(Integer min, Integer max) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(ADD_BTN),
                Scroll.to(TITLE_TO_SCROLL),
                AddRandomAmountOfProducts.betweenARange(min, max),
                Click.on(CART_BUTTON),
                GetFinalPriceAndName.method()
        );
    }
    @Then("the result on the cart should be ok")
    public void theResultOnTheCartShouldBeOk() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(ComparePrices.isOk(), Matchers.is(true)),
                seeThat(CompareNameProduct.isOk(), Matchers.is(true))


          );
    }
}
