package co.com.choucair.automation.android.stepdefinitions;

import co.com.choucair.automation.android.tasks.InitialRegister;
import co.com.choucair.automation.android.tasks.OpenThe;
import co.com.choucair.automation.android.tasks.Register;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegisterStepDefinitions {



    @Given("^that user is on register page$")
    public void thatUserIsOnRegisterPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenThe.exitoApp());
    }


    @When("^I enter the name david and lastname quijano$")
    public void iEnterTheEmailDavidGmailComAndPassword() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                InitialRegister.register(),
                Register.registerDates()
        );
    }


}
