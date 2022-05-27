package co.com.testerscolombia.certification.questions;

import net.serenitybdd.screenplay.Question;

import static co.com.testerscolombia.certification.userInterfaces.MilescarrentalUI.BTN_PAY;

public class QuestionMilescarrental {
    public static Question<String> btnPay() {
        return actor -> BTN_PAY.resolveFor(actor).getText().trim();
    }
}
