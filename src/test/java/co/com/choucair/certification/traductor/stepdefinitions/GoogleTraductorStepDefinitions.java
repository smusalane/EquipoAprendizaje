package co.com.choucair.certification.traductor.stepdefinitions;

import co.com.choucair.certification.traductor.model.GoogleTraductorData;
import co.com.choucair.certification.traductor.tasks.OpenUp;
import co.com.choucair.certification.traductor.tasks.Traductor;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class GoogleTraductorStepDefinitions {
    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Yeison wants to use google translate$")
    public void thatYeisonWantsToUseGoogleTranslate()  {
      OnStage.theActorCalled("Yeison").wasAbleTo(OpenUp.thePage());
    }

    @When("^He translates a word from English to Spanish$")
    public void heTranslatesAWordFromEnglishToSpanish(List<GoogleTraductorData> GoogleTraductorData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Traductor.FromEnglishToSpanish(GoogleTraductorData));
    }  {
    }

    @Then("^He should see the word translated from source language to target language$")
    public void heShouldSeeTheWordTranslatedFromSourceLanguageToTargetLanguage(DataTable arg1)  {

    }
}
