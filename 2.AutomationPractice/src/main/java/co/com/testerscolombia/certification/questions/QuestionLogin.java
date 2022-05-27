package co.com.testerscolombia.certification.questions;

import net.serenitybdd.screenplay.Question;

import static co.com.testerscolombia.certification.userInterfaces.LoginUI.NAME_CUSTOMER;


public class QuestionLogin {

    public static Question<String> customerName() {
        return actor -> NAME_CUSTOMER.resolveFor(actor).getText().trim();
    }
}
