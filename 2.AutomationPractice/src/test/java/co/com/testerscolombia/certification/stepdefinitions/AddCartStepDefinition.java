package co.com.testerscolombia.certification.stepdefinitions;

import co.com.testerscolombia.certification.questions.QuestionAddCart;
import co.com.testerscolombia.certification.questions.QuestionTabDresses;
import co.com.testerscolombia.certification.tasks.AddCartTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.testerscolombia.certification.tasks.AddCartTask.addCartTask;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class AddCartStepDefinition {
    @Managed
    WebDriver driver;
    Actor actor;
    String msmAdded="Product successfully added to your shopping cart";
    @Before
    public void setTheStage() {
        OnStage.setTheStage( new OnlineCast() );
        actor = Actor.named( "Usuario" );
        actor.can( BrowseTheWeb.with( driver ) );
    }
    @When("the user navigates to the dresses tab and filters by the highest price")
    public void theUserNavigatesToTheDressesTabAndFiltersByTheHighestPrice() {
        actor.attemptsTo(
                addCartTask()
        );


    }
    @Then("the user adds the first product in the list to the cart")
    public void theUserAddsTheFirstProductInTheListToTheCart() {
        actor.should(
                seeThat( "add product to cart", QuestionAddCart.addCart(), equalTo( msmAdded ) )
        );

    }


}
