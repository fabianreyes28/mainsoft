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

import static co.com.testerscolombia.certification.userInterfaces.MilescarrentalUI.*;
import static co.com.testerscolombia.certification.utils.ExcelReader.ruta;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class Milescarrental implements Task {
    ExcelReader reader = new ExcelReader();
    List<Map< String, String >> testData = reader.getData( ruta, "Register" );

    String aero = testData.get( 0 ).get( "AERO" );
    String nomb = testData.get( 0 ).get( "NOMBRE" );
    String num = testData.get( 0 ).get( "NUMERO" );
    String mail = testData.get( 0 ).get( "CORREO" );


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(TEX_BOX, isClickable()).forNoMoreThan(10).seconds(),
                Enter.theValue(aero).into(TEX_BOX),
                Click.on(TEX_BOX),
                WaitUntil.the(TEX_BOX, isClickable()).forNoMoreThan(10).seconds(),
                WaitUntil.the(FLORIDA, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(FLORIDA),
                WaitUntil.the(CALENDAR, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(CALENDAR),
                WaitUntil.the(DATE_R, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(DATE_R),
                WaitUntil.the(DATE_D, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(DATE_D),
                Click.on(BTN_SEARCH),
                WaitUntil.the(CAR_2, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(CAR_2),
                WaitUntil.the(NAME, isClickable()).forNoMoreThan(10).seconds(),
                Enter.theValue( nomb ).into( NAME ),
                Enter.theValue( num ).into( PHONE ),
                Enter.theValue( mail ).into( EMAIL ),
                Click.on(BTN_NEXT)

        );
    }

    public static Performable milescarrental() {
        return instrumented(Milescarrental.class);
    }
}

