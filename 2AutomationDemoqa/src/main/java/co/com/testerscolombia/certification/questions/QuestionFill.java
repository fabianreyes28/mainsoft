package co.com.testerscolombia.certification.questions;

import net.serenitybdd.screenplay.Question;

import static co.com.testerscolombia.certification.userInterfaces.FillInformation.MSG_THANKS;


public class QuestionFill {
    public static Question<String> qfill() {
        return actor -> MSG_THANKS.resolveFor(actor).getText().trim();
    }
}
