package co.com.testerscolombia.certification.stepdefinitions;

import co.com.testerscolombia.certification.page.AutomationPractice;
import co.com.testerscolombia.certification.page.OpenBrowser;

import co.com.testerscolombia.certification.questions.QuestionRegister;
import co.com.testerscolombia.certification.tasks.RegisterTask;
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

import static co.com.testerscolombia.certification.tasks.RegisterTask.registerTask;

import static java.util.concurrent.TimeUnit.SECONDS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;


public class RegisterStepDefinition {

    @Managed
    WebDriver driver;
    Actor actor;
    AutomationPractice automationPractice;
    String msmWelcome="Welcome to your account. Here you can manage all of your personal information and orders.";

    @Before
    public void setTheStage() {
        OnStage.setTheStage( new OnlineCast() );
        actor = Actor.named( "Usuario" );
        actor.can( BrowseTheWeb.with( driver ) );
    }

    @Given( "the user to enter the page automationpractice" )
    public void theUserToEnterThePageAutomationpractice() {

        actor.has( OpenBrowser.onPage( automationPractice ) );
    }

    @When( "requires registration on the page" )
    public void requiresRegistrationOnThePage() {
        actor.attemptsTo(
                registerTask()
        );


    }

    @Then( "validates that your registration is successful" )
    public void validatesThatYourRegistrationIsSuccessful() {
              actor.should(
                seeThat( "the displayed username", QuestionRegister.customer(), equalTo( msmWelcome ) )
        );


    }
}
