package co.com.testerscolombia.certification.questions;

import net.serenitybdd.screenplay.Question;

import static co.com.testerscolombia.certification.userInterfaces.SearchDressesUI.MSM_RESULT_DRESSES;


public class QuestionSearchDresses {
    public static Question<String> Search() {
        return actor -> MSM_RESULT_DRESSES.resolveFor(actor).getText().trim();
    }
}
