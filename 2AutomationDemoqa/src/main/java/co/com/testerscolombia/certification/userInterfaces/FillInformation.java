package co.com.testerscolombia.certification.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;


public class FillInformation {
    public static Target FIRST_NAME = Target.the("First name").
            locatedBy("//*[@id=\"firstName\"]");

    public static Target LAST_NAME = Target.the("LAST name").
            locatedBy("//*[@id=\"lastName\"]");

    public static Target EMAIL = Target.the("Email").
            locatedBy("//*[@id=\"userEmail\"]");

    public static Target MOBILE_NUMBER = Target.the("Mobile number").
            locatedBy("//*[@id=\"userNumber\"]");

    public static Target GENDER_MALE = Target.the("Gender male").
            locatedBy("//label[normalize-space()='Male']");

    public static Target DATE_OF_BIRTH = Target.the("Date of Birth").
            locatedBy("//*[@id=\"dateOfBirthInput\"]");

    public static Target DIA = Target.the("Date of Birth dia").
            locatedBy("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[1]");


    public static Target LIST_MONTH = Target.the("Month Date of Birth").
            locatedBy("//select[@class='react-datepicker__month-select']");
    public static Target JAN = Target.the("Month Date of Birth").
            locatedBy("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[1]");
 public static Target ANNO = Target.the("YEAR Date of Birth").
            locatedBy("//select[@class='react-datepicker__year-select']");


    public static Target SUBJECTS1 = Target.the("Subjects").
            locatedBy("//*[@id=\"subjectsContainer\"]/div/div[1]");
public static Target SUBJECTS2 = Target.the("Subjects").
            locatedBy("//input[@id='subjectsInput']");

    public static Target CHECK_MUSIC = Target.the("check music").
            locatedBy("//label[normalize-space()='Music']");

    public static Target BTN_UPLOAD_PICTURE = Target.the("Button upload Picture").
            locatedBy("//label[text()='Select picture']");

    public static Target CURRENT_ADDRESS = Target.the("Current Address").
            locatedBy("//*[@id=\"currentAddress\"]");

    public static Target LIST_STATE_1 = Target.the("Current Address").
            locatedBy("//div[@id=\"state\"]/div/div[1]");

  public static Target LIST_STATE_11 = Target.the("Current Address").
            locatedBy("//div[@id=\"state\"]/div/div[1]/div[1]");

    public static Target STATE = Target.the("List State and City 1").
           // locatedBy("(//div[contains(text(),'Select State')])[1]");
            locatedBy(" (//div[@class=' css-1uccc91-singleValue'])[1]");


    public static Target LIST_STATE_2 = Target.the("List State and City 2").
            locatedBy("//div[@id=\"stateCity-wrapper\"]/div[3]/div");

    public static Target CITY = Target.the("Lucknow").
            locatedBy("//div[contains(@class,'css-1hwfws3')]//div[contains(text(),'Delhi')]");

    public static Target BTN_SUBMIT = Target.the("Button submit").
            locatedBy("//button[@id='submit']");

    public static Target MSG_THANKS = Target.the("Msg Thanks for submitting the form").
            locatedBy("//*[@id=\"example-modal-sizes-title-lg\"]");

    public static Target BTN_CLOSE = Target.the("Button close").
            locatedBy("//*[@id=\"closeLargeModal\"]");

}
