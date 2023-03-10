package co.com.choucair.automation.android.stepdefinitions;

import co.com.choucair.automation.android.questions.ValidateProduct;
import co.com.choucair.automation.android.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginStepDefinitios {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("actor");
    }

    @Given("^that user is on login page$")
    public void thatUserIsOnLoginPage() {
       OnStage.theActorInTheSpotlight().wasAbleTo(OpenThe.exitoApp());

    }

    @When("^I enter the email and password$")
    public void iEnterTheEmailDavidGmailComAndPassword() {

        OnStage.theActorInTheSpotlight().attemptsTo(
                InitialLogin.enterLogin(),
                Login.registerDates()
        );
    }
    @When("^add products in the shopping cart$")
    public void addProductsInTheShoppingCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(
           ProductSelect.pruductSelect()

        );
    }

    @Then("^I should see the product pull$")
    public void iShouldSeeTheProductPull() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(ValidateProduct.validateProd(), Matchers.is(true))
        );


    }

}
