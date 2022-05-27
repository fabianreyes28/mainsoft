package co.com.testerscolombia.certification.stepdefinitions;

import co.com.testerscolombia.certification.page.AutomationPractice;
import co.com.testerscolombia.certification.page.OpenBrowser;
import co.com.testerscolombia.certification.questions.QuestionFill;
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

import java.awt.*;

import static co.com.testerscolombia.certification.tasks.FillInformation.fillInformation;
import static co.com.testerscolombia.certification.tasks.SelectList.selectList;
import static co.com.testerscolombia.certification.tasks.UploadFile.uploadFile;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class FillInformationStepDefinition {

    @Managed
    WebDriver driver;
    Actor actor;
    AutomationPractice automationPractice;
    String customerName = "fabian reyes";
    String msm="Thanks for submitting the form";


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        actor = Actor.named("Usuario");
        actor.can(BrowseTheWeb.with(driver));
    }


    @Given("that the user fills in the form on the demoqa.com site")
    public void thatTheUserFillsInTheFormOnTheDemoqaComSite() {
        actor.has(OpenBrowser.onPage(automationPractice));
    }

    @When("the user enters the information in the form")
    public void theUserEntersTheInformationInTheForm() throws InterruptedException, AWTException {

        actor.attemptsTo(
                selectList(),
                uploadFile(),
                fillInformation()

        );

    }

    @Then("the successful submission is validated")
    public void theSuccessfulSubmissionIsValidated() {
        actor.should(
                seeThat("add product to cart", QuestionFill.qfill(), equalTo(msm))
        );


    }


}
