package co.com.testerscolombia.certification.questions;

import net.serenitybdd.screenplay.Question;

import static co.com.testerscolombia.certification.userInterfaces.Milescarrental2.MSG_WELCOME;

public class QuestionMilescarrental {
    public static Question<String> msgReg() {
        return actor -> MSG_WELCOME.resolveFor(actor).getText().trim();
    }
}
