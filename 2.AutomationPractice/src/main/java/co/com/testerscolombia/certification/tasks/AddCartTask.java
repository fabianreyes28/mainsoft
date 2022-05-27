package co.com.testerscolombia.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.testerscolombia.certification.userInterfaces.AddCartUI.BTN_ADD_CART;
import static co.com.testerscolombia.certification.userInterfaces.AddCartUI.LIST_SORT;
import static co.com.testerscolombia.certification.userInterfaces.RegisterUI.INPUT_CITY;
import static co.com.testerscolombia.certification.userInterfaces.RegisterUI.SELECT_DATE_YEAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class AddCartTask implements Task {

    String price="price:desc";
    @Override
    public < T extends Actor > void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(LIST_SORT),
                Click.on(LIST_SORT),
               //WaitUntil.the( LIST_SORT, isClickable() ).forNoMoreThan( 10 ).seconds(),
                SelectFromOptions.byValue( price ).from( LIST_SORT ),
                Click.on(BTN_ADD_CART)
        );
    }
    public static Performable addCartTask() {
        return instrumented( AddCartTask.class );
    }
}
