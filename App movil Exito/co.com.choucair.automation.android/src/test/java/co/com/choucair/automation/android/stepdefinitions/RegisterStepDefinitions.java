package co.com.choucair.automation.android.stepdefinitions;

import co.com.choucair.automation.android.questions.ValidateProduct;
import co.com.choucair.automation.android.tasks.InitialPageTask;
import co.com.choucair.automation.android.tasks.OpenThe;
import co.com.choucair.automation.android.tasks.Register;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegisterStepDefinitions {



    @Given("^that user is on register page$")
    public void thatUserIsOnRegisterPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenThe.exitoApp());
    }


    @When("^I enter the name david and lastname quijano$")
    public void iEnterTheEmailDavidGmailComAndPassword() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                InitialPageTask.register(),
                Register.registerDates()
        );
    }


}
