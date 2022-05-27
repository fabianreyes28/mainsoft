package co.com.testerscolombia.certification.stepdefinitions;

import co.com.testerscolombia.certification.page.AutomationPractice;
import co.com.testerscolombia.certification.page.OpenBrowser;
import co.com.testerscolombia.certification.questions.QuestionRegister;
import co.com.testerscolombia.certification.questions.QuestionSearchDresses;
import co.com.testerscolombia.certification.tasks.SearchDressesTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.testerscolombia.certification.tasks.LoginTask.loginTask;
import static co.com.testerscolombia.certification.tasks.SearchDressesTask.searchDressesTask;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class SearchDressesStepDefinition {

    @Managed
    WebDriver driver;
    Actor actor;
    AutomationPractice automationPractice;
    String msmResult="7 results have been found.";
    @Before
    public void setTheStage() {
        OnStage.setTheStage( new OnlineCast() );
        actor = Actor.named( "Usuario" );
        actor.can( BrowseTheWeb.with( driver ) );
    }

    @Given("the already registered user logs in successfully")
    public void theAlreadyRegisteredUserLogsInSuccessfully() {

        actor.has( OpenBrowser.onPage( automationPractice ) );
    }
    @When("the user searches for a dress")
    public void theUserSearchesForADress() {
        actor.attemptsTo(
                loginTask(),
                searchDressesTask()
        );


    }
    @Then("the user validates the results of dressesl")
    public void theUserValidatesTheResultsOfDressesl()  {
        actor.should(
                seeThat( "the displayed msm of result", QuestionSearchDresses.Search(), equalTo( msmResult ) )
        );
    }

}
