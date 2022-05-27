package co.com.testerscolombia.certification.questions;

import net.serenitybdd.screenplay.Question;
import static co.com.testerscolombia.certification.userInterfaces.RegisterUI.MSM_WELCOME;


public class QuestionRegister {
    public static Question<String> customer() {
        return actor -> MSM_WELCOME.resolveFor(actor).getText();
    }



}
