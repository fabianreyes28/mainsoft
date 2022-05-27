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


public class MilescarrentalStepDefinition {
    @Managed
    WebDriver driver;
    Actor actor;
    Milescarrental milescarrental;
    String customerName = "fabian reyes";
    String msmbtn = "PAGAR AHORA";

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

    @When("the user searches for airport and date and selects the second car")
    public void theUserSearchesForAirportAndDate() {
        actor.attemptsTo(
                milescarrental()
        );

    }

    @Then("the pay now button is validated")
    public void thePayNowButtonIsValidated() {
        actor.should(
                seeThat("add product to cart", QuestionMilescarrental.btnPay(), equalTo(msmbtn))
        );

    }


}
