package co.com.testerscolombia.certification.questions;

import net.serenitybdd.screenplay.Question;

import static co.com.testerscolombia.certification.userInterfaces.AddCartUI.MSM_ADDED;


public class QuestionAddCart {
    public static Question<String> addCart() {
        return actor -> MSM_ADDED.resolveFor(actor).getText().trim();
    }
}
