package stepdefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import retotecnicochoucair.model.Data;
import retotecnicochoucair.tasks.Delete;
import retotecnicochoucair.tasks.Get;
import retotecnicochoucair.tasks.Post;
import retotecnicochoucair.tasks.Put;

import static retotecnicochoucair.util.Constantes.CONSULTAR;
import static retotecnicochoucair.util.Constantes.EMPLEADO_ESPECIFICO;

public class DummyApiStepDefinitions {


    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("actor");
    }

    @Given("Consult employee information")
    public void consultEmployeeInformation() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Get.consulta(EMPLEADO_ESPECIFICO));
    }
    @Given("Update employee information {string}, {string}, {string}")
    public void updateEmployeeInformation(String nombre,String salario, String edad) {
        Data data = new Data();
        data.setNombre(nombre);
        data.setSalario(salario);
        data.setEdad(edad);
        OnStage.theActorInTheSpotlight().attemptsTo(Put.actualiza(data));

    }
    @When("delete employee information")
    public void deleteEmployeeInformation() {
        OnStage.theActorInTheSpotlight().attemptsTo(Delete.borrar());

    }
    @When("Create New Employee {string}, {string}, {string}")
    public void createNewEmployee(String nombre, String salario, String edad) {
        Data data = new Data();
        data.setNombre(nombre);
        data.setSalario(salario);
        data.setEdad(edad);
        OnStage.theActorInTheSpotlight().attemptsTo(Post.update(data));



    }
    @When("Consult every employee information")
    public void consultEveryEmployeeInformation() {
        OnStage.theActorInTheSpotlight().attemptsTo(Get.consulta(CONSULTAR));



    }


}