package co.com.testerscolombia.certification.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {
    public static Target EMAIL = Target.the( "input Email address " ).
            locatedBy( "//input[@id='email']" );

    public static Target PASSWORD = Target.the( "input password " ).
            locatedBy( "//input[@id='passwd']" );

    public static Target BTN_SING_IN = Target.the( "input password " ).
            locatedBy( "//span[normalize-space()='Sign in']" );

    public static Target NAME_CUSTOMER = Target.the( "View my name customer" ).
            locatedBy( "a[title='View my customer account'] span" );
}
