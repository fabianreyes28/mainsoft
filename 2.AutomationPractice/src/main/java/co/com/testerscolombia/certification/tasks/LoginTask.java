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

import static co.com.testerscolombia.certification.userInterfaces.LoginUI.*;
import static co.com.testerscolombia.certification.userInterfaces.RegisterUI.INPUT_EMAIL_REGISTER;
import static co.com.testerscolombia.certification.userInterfaces.RegisterUI.SIGN_IN;
import static co.com.testerscolombia.certification.utils.ExcelReader.ruta;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class LoginTask implements Task {
    ExcelReader reader = new ExcelReader();
    List< Map< String, String > > testData = reader.getData( ruta, "Register" );
    String userOK = testData.get( 0 ).get( "UserOK" );
    String password = testData.get( 0 ).get( "Password" );

    @Override
    public < T extends Actor > void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the( SIGN_IN, isClickable() ).forNoMoreThan( 10 ).seconds(),
                Click.on( SIGN_IN ),
                WaitUntil.the( EMAIL, isClickable() ).forNoMoreThan( 10 ).seconds(),
                Enter.theValue(  userOK ).into( EMAIL ),
                Enter.theValue(  password ).into( PASSWORD ),
                Click.on( BTN_SING_IN )
                );
    }
    public static Performable loginTask() {
        return instrumented( LoginTask.class );
    }
}
