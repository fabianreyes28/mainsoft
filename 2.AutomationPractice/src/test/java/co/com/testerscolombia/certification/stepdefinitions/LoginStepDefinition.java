package co.com.testerscolombia.certification.stepdefinitions;

import co.com.testerscolombia.certification.page.AutomationPractice;
import co.com.testerscolombia.certification.page.OpenBrowser;
import co.com.testerscolombia.certification.questions.QuestionLogin;
import co.com.testerscolombia.certification.questions.QuestionRegister;
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
import static co.com.testerscolombia.certification.tasks.RegisterTask.registerTask;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepDefinition {
    @Managed
    WebDriver driver;
    Actor actor;
    AutomationPractice automationPractice;
    String customerName="fabian reyes";

    @Before
    public void setTheStage() {
        OnStage.setTheStage( new OnlineCast() );
        actor = Actor.named( "Usuario" );
        actor.can( BrowseTheWeb.with( driver ) );
    }

    @Given("the registered user logs in to the page automationpractice")
    public void theRegisteredUserLogsInToThePageAutomationpractice() {
        actor.has( OpenBrowser.onPage( automationPractice ) );
    }
    @When("the user enters valid credentials")
    public void theUserEntersValidCredentials() {
        actor.attemptsTo(
                loginTask()
        );
        }
    @Then("validates successful login")
    public void validatesSuccessfulLogin() {
        actor.should(
                seeThat( "the displayed username", QuestionLogin.customerName(), equalTo( customerName ) )
        );

    }


}
