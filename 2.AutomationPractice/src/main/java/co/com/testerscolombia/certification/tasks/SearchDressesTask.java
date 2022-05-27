package co.com.testerscolombia.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.testerscolombia.certification.userInterfaces.SearchDressesUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SearchDressesTask implements Task {


    @Override
    public < T extends Actor > void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the( INPUT_SEARCH, isClickable() ).forNoMoreThan( 10 ).seconds(),
                Enter.theValue(  "dresses" ).into( INPUT_SEARCH ),
                Click.on( BTN_SEARCH )
        );
    }

    public static Performable searchDressesTask() {
        return instrumented( SearchDressesTask.class );
    }
}
