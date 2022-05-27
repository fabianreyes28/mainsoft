package co.com.testerscolombia.certification.tasks;

import co.com.testerscolombia.certification.utils.ExcelReader;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static co.com.testerscolombia.certification.userInterfaces.Milescarrental2.*;
import static co.com.testerscolombia.certification.utils.ExcelReader.ruta;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class Milescarrental implements Task {
    ExcelReader reader = new ExcelReader();
    List< Map< String, String > > testData = reader.getData( ruta, "Register" );
    int numero = (int) (Math.random() * 100000000);
    String user = testData.get( 0 ).get( "EMAIL" );
    String pass = testData.get( 0 ).get( "PASS" );
    String userRandom = numero + user;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(BTN_SINGIN, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(BTN_SINGIN),
                Enter.theValue(userRandom).into(EMAIL),
                Enter.theValue(pass).into(PASS1),
                Enter.theValue(pass).into(PASS2),
                Click.on(BTN_REG)

        );
        System.out.println("mensajeeee  : "+MSG_WELCOME.resolveFor(actor).getText().trim());
    }

    public static Performable milescarrental() {
        return instrumented(Milescarrental.class);
    }
}

