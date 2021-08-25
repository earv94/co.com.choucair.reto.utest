package co.com.choucair.reto.utest.stepdefinitions;

import co.com.choucair.reto.utest.model.UtestData;
import co.com.choucair.reto.utest.questions.Answer;
import co.com.choucair.reto.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage (){ OnStage.setTheStage(new OnlineCast());}

    @Given("^than brandom wants to signup at the Utest page$")
    public void thanBrandomWantsToSignupAtTheUtestPage() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), SignUp.onThePage());
    }


    @When("^he fill out the registration form on the Utest web page$")
    public void heFillOutTheRegistrationFormOnTheUtestWebPage(List<UtestData> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(FillStepOneSignupForm.onThePage(utestData.get(0)),
                FillStepTwoSignupForm.onThePage(utestData.get(0)),
                FillStepThreeSignupForm.onThePage(utestData.get(0)),
                FillStepFourSignupForm.onThePage(utestData.get(0)));
    }

    @Then("^he should see the confirmation page at the Utest web page$")
    public void heShouldSeeTheConfirmationPageAtTheUtestWebPage(List<UtestData> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestData.get(0).getStrText())));
    }

}
