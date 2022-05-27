package co.com.testerscolombia.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.testerscolombia.certification.userInterfaces.BrowseTabUI.TAB_DRESSES;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class TabDressesTask implements Task {
    @Override
    public < T extends Actor > void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the( TAB_DRESSES, isClickable() ).forNoMoreThan( 10 ).seconds(),
                Click.on( TAB_DRESSES )
        );
    }
    public static Performable tabDressesTask() {
        return instrumented( TabDressesTask.class );
    }
}
