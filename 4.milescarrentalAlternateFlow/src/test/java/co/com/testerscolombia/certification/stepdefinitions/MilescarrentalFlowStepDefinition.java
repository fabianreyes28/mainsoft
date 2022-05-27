package co.com.testerscolombia.certification.stepdefinitions;

import co.com.testerscolombia.certification.page.Milescarrental;
import co.com.testerscolombia.certification.page.OpenBrowser;
import co.com.testerscolombia.certification.questions.QuestionMilescarrental;
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

import static co.com.testerscolombia.certification.tasks.Milescarrental.milescarrental;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class MilescarrentalFlowStepDefinition {


    @Managed
    WebDriver driver;
    Actor actor;
    Milescarrental milescarrental;
    String customerName = "fabian reyes";
    String msm = "Gracias por registrarte en Miles Car Rental.";

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        actor = Actor.named("Usuario");
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("that the user enters the page milescarrenta")
    public void thatTheUserEntersThePageMilescarrenta() {
        actor.has(OpenBrowser.onPage(milescarrental));
    }


    @When("the user performs the registration process")
    public void theUserPerformsTheRegistrationProcess() {
        actor.attemptsTo(
                milescarrental()
        );

    }
    @Then("the registration is successfully validated")
    public void theRegistrationIsSuccessfullyValidated() {
        actor.should(
                seeThat( "add product to cart", QuestionMilescarrental.msgReg(), equalTo( msm ) )
        );

    }
}
