package co.com.testerscolombia.certification.stepdefinitions;

import co.com.testerscolombia.certification.questions.QuestionLogin;
import co.com.testerscolombia.certification.questions.QuestionTabDresses;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.testerscolombia.certification.tasks.TabDressesTask.tabDressesTask;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class BrowseTabStepDefinition {
    @Managed
    WebDriver driver;
    Actor actor;
    String category= "Dresses";


    @Before
    public void setTheStage() {
        OnStage.setTheStage( new OnlineCast() );
        actor = Actor.named( "Usuario" );
        actor.can( BrowseTheWeb.with( driver ) );
    }
    @When("the user navigates to the dress tab")
    public void theUserNavigatesToTheDressTab() {
        actor.attemptsTo(
                tabDressesTask()
        );

    }
    @Then("the user validates the results list of dresses")
    public void theUserValidatesTheResultsListOfDresses() {
        actor.should(
                seeThat( "the displayed category dresses", QuestionTabDresses.tab(), equalTo( category ) )
        );

    }
}
