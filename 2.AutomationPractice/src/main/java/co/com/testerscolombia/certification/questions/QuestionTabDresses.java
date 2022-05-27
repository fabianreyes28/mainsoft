package co.com.testerscolombia.certification.questions;

import net.serenitybdd.screenplay.Question;

import static co.com.testerscolombia.certification.userInterfaces.BrowseTabUI.CATEGORY_DRESSES;


public class QuestionTabDresses {
    public static Question<String> tab() {
        return actor -> CATEGORY_DRESSES.resolveFor(actor).getText().trim();
    }
}
