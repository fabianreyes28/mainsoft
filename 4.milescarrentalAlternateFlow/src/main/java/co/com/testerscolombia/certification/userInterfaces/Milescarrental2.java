package co.com.testerscolombia.certification.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Milescarrental2 {
    public static Target BTN_SINGIN = Target.the("Button sing in").
            locatedBy("//button[@id=\"btnSignIn\"]");

    public static Target EMAIL = Target.the("Input Email").
            locatedBy("//input[@id=\"inpEmailRegister\"]");

    public static Target PASS1 = Target.the("Input password").
            locatedBy("//input[@id=\"inpPasswordRegister\"]");

    public static Target PASS2 = Target.the("Input password confirm").
            locatedBy("//input[@id=\"inpPasswordTwo\"]");

    public static Target BTN_REG = Target.the("Input password confirm").
            locatedBy("//buttom[@id=\"btnRegister\"]");

    public static Target MSG_WELCOME = Target.the("Input password confirm").
            locatedBy(" //h5[@class='heading heading-XXS heading--initial']");


}
