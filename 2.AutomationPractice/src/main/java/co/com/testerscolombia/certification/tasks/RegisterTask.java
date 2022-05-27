package co.com.testerscolombia.certification.tasks;

import co.com.testerscolombia.certification.utils.ExcelReader;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static co.com.testerscolombia.certification.userInterfaces.RegisterUI.*;
import static co.com.testerscolombia.certification.utils.ExcelReader.ruta;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class RegisterTask implements Task {
    ExcelReader reader = new ExcelReader();
    List< Map< String, String > > testData = reader.getData( ruta, "Register" );
    int numero = (int) (Math.random() * 100000000);
    String user = testData.get( 0 ).get( "User" );
    String userRandom = numero + user;
    int day= Integer.parseInt( testData.get( 0 ).get("Day") );
    int month= Integer.parseInt( testData.get( 0 ).get("Month") );
    String year= testData.get( 0 ).get("Year") ;
    int State= Integer.parseInt( testData.get( 0 ).get( "State" ) );
    String firstName =testData.get( 0 ).get( "FirstName" );
    String lastName= testData.get( 0 ).get( "LastName" ) ;
    String password = testData.get( 0 ).get( "Password" );



    @Override
    public < T extends Actor > void performAs(T actor) {
        System.out.println("User ---> "+ userRandom);
        actor.attemptsTo(
                WaitUntil.the( SIGN_IN, isClickable() ).forNoMoreThan( 10 ).seconds(),
                Click.on( SIGN_IN ),
                Enter.theValue( userRandom ).into( INPUT_EMAIL_REGISTER ),
                Click.on( BTN_CREATE_ACCOUNT ),
                WaitUntil.the( RADIO_BTN_MR, isClickable() ).forNoMoreThan( 10 ).seconds(),
                Click.on( RADIO_BTN_MR ),
                Enter.theValue( firstName ).into( INPUT_FIRST_NAME ),
                Enter.theValue(lastName ).into( INPUT_LAST_NAME ),
                Enter.theValue( password ).into( INPUT_PASSWORD ),
                SelectFromOptions.byIndex( day ).from( SELECT_DATE_DAY ),
                SelectFromOptions.byIndex( month ).from( SELECT_DATE_MONTH ),
                SelectFromOptions.byIndex( month ).from( SELECT_DATE_MONTH ),
                SelectFromOptions.byValue( year ).from( SELECT_DATE_YEAR ),
                Scroll.to(INPUT_CITY),
                Enter.theValue( testData.get( 0 ).get( "Company" ) ).into( INPUT_COMPANY ),
                Enter.theValue( testData.get( 0 ).get( "Direction" ) ).into( INPUT_ADDRESS ),
                Enter.theValue( testData.get( 0 ).get( "City" ) ).into( INPUT_CITY ),
                SelectFromOptions.byIndex(State).from( SELECT_STATE ),
                Enter.theValue( testData.get( 0 ).get( "PostalCode" ) ).into( INPUT_POSTAL ),
                Enter.theValue( testData.get( 0 ).get( "MobilePhone" ) ).into( INPUT_NUMBER_PHONE ),
                Enter.theValue( testData.get( 0 ).get( "Alias" ) ).into( INPUT_ALIAS ),
                Click.on( BTN_REGISTER ),
                WaitUntil.the( MSM_WELCOME, isClickable() ).forNoMoreThan( 10 ).seconds()



        );
    }

    public static Performable registerTask() {
        return instrumented( RegisterTask.class );
    }
}
