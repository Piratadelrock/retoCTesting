package co.com.utest.stepdefinitions;

import co.com.utest.model.UTestData;
import co.com.utest.tasks.OpenUp;
import co.com.utest.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class UTestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Emmanuel wants to create an account on uTest$")
    public void thatEmmanuelWantsToCreateAnAccountOnUTest(){
        OnStage.theActorCalled("Emmanuel").wasAbleTo(OpenUp.thePage());
    }


    @When("^he enters Join Today, he opens a form to register on the platform$")
    public void heEntersJoinTodayHeOpensAFormToRegisterOnThePlatform(List<UTestData> utData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Register.onThePage(utData.get(0)));
    }


    @Then("^fill in the form$")
    public void fillInTheForm(){

    }
}
