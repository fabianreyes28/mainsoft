package co.com.testerscolombia.certification.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.testerscolombia.certification.userInterfaces.FillInformation.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SelectList implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(LIST_STATE_11),
                WaitUntil.the(LIST_STATE_11, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(LIST_STATE_11)
        );

        //lista1
        Target target = Target.the("Options").locatedBy("//*[text()='{0}']");
        List<WebElementFacade> elementFacade = target.of("NCR").resolveAllFor(actor);
        System.out.println("ELEMENTOS ENCONTRADOS 1:" + elementFacade.size());


        actor.attemptsTo(

                Click.on(elementFacade.get(0)),
                WaitUntil.the(LIST_STATE_2, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(LIST_STATE_2)

        );

        //lista2
        Target target2 = Target.the("Options").locatedBy("//*[text()='{0}']");
        List<WebElementFacade> elementFacade2 = target.of("Delhi").resolveAllFor(actor);
        System.out.println("ELEMENTOS ENCONTRADOS:" + elementFacade.size());
        System.out.println("ES VISIBLE EL BUTTON: "+ BTN_SUBMIT.isVisibleFor(actor));
        actor.attemptsTo(

                Click.on(elementFacade2.get(0)));
        System.out.println("ES VISIBLE EL BUTTON: "+ BTN_SUBMIT.isVisibleFor(actor));


    }

    public static Performable selectList() {
        return instrumented(SelectList.class);
    }
}
