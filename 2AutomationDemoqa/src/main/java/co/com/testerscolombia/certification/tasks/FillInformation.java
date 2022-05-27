package co.com.testerscolombia.certification.tasks;

import co.com.testerscolombia.certification.utils.ExcelReader;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;


import java.util.List;
import java.util.Map;


import static co.com.testerscolombia.certification.userInterfaces.FillInformation.*;
import static co.com.testerscolombia.certification.utils.ExcelReader.ruta;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class FillInformation implements Task {

    ExcelReader reader = new ExcelReader();
    List<Map<String, String>> testData = reader.getData(ruta, "Register");
    //DATA
    String user = testData.get(0).get("Name");
    String lastName = testData.get(0).get("Lastname");
    String email = testData.get(0).get("Email");
    String mobilenumber = testData.get(0).get("Mobilenumber");
    String dateOfBirth = testData.get(0).get("Dateofbirth");
    String subjects = testData.get(0).get("Subjects");
    String currentAddress = testData.get(0).get("CurrentAddress");
    String estate1 = testData.get(0).get("Estate1");
    String estate2 = testData.get(0).get("Estate2");


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                // Click.on( SUBJECTS1 ),

                WaitUntil.the(FIRST_NAME, isClickable()).forNoMoreThan(10).seconds(),
                Enter.theValue(user).into(FIRST_NAME),
                Enter.theValue(lastName).into(LAST_NAME),
                Enter.theValue(email).into(EMAIL),
                Click.on(GENDER_MALE),
                Click.on(MOBILE_NUMBER),
                Enter.theValue(mobilenumber).into(MOBILE_NUMBER),
                Click.on(DATE_OF_BIRTH),
                SendKeys.of("jan").into(LIST_MONTH),
                SendKeys.of("2000").into(ANNO),
                SendKeys.of("2000").into(ANNO),
                Click.on(DIA),
                DoubleClick.on(SUBJECTS1),
                Enter.theValue(subjects).into(SUBJECTS2).thenHit(Keys.ENTER),
                Click.on(CHECK_MUSIC),
                Enter.theValue(currentAddress).into(CURRENT_ADDRESS),
                Enter.theValue(lastName).into(LAST_NAME).thenHit(Keys.ENTER));
       // System.out.println("mensajeeeee:  "+MSG_THANKS.resolveFor(actor).getText().trim());

    }

    public static Performable fillInformation() {
        return instrumented(FillInformation.class);
    }
}

