package co.com.testerscolombia.certification.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterUI {

    public static Target SIGN_IN = Target.the( "Option sign in" ).
            locatedBy( "//a[@title='Log in to your customer account']" );

    public static Target INPUT_EMAIL_REGISTER = Target.the( "Enter email to register" ).
            locatedBy( "//input[@id='email_create']" );

    public static Target BTN_CREATE_ACCOUNT = Target.the( "Button create email to register" ).
            locatedBy( "//span[normalize-space()='Create an account']" );

    public static Target RADIO_BTN_MR = Target.the( "Radio button select title Mr" ).
            locatedBy( "//input[@id='id_gender1']" );

    public static Target INPUT_FIRST_NAME = Target.the( "input text first name" ).
            locatedBy( "//input[@id='customer_firstname']" );

    public static Target INPUT_LAST_NAME = Target.the( "input text last name" ).
            locatedBy( "//input[@id='customer_lastname']" );

    public static Target INPUT_PASSWORD = Target.the( "Input text password" ).
            locatedBy( "//input[@id='passwd']" );

    public static Target SELECT_DATE_DAY = Target.the( "Select data of birth day" ).
            locatedBy( "//select[@id='days']" );

    public static Target SELECT_DATE_MONTH = Target.the( "Select data of birth month" ).
            locatedBy( "//select[@id='months']" );

    public static Target SELECT_DATE_YEAR = Target.the( "Select data of birth year" ).
            locatedBy( "(//select[@id='years'])" );


    public static Target INPUT_COMPANY = Target.the( "input text company" ).
            locatedBy( "//input[@id='company']" );

    public static Target INPUT_ADDRESS = Target.the( "input text address" ).
            locatedBy( "//input[@id='address1']" );

    public static Target INPUT_CITY = Target.the( "input text city" ).
            locatedBy( "//input[@id='city']" );

    public static Target SELECT_STATE= Target.the( "Select state" ).
            locatedBy( "//select[@id='id_state']" );

    public static Target INPUT_POSTAL = Target.the( "input text postal code" ).
            locatedBy( "//input[@id='postcode']" );

    public static Target INPUT_NUMBER_PHONE = Target.the( "input text number phone" ).
            locatedBy( "//input[@id='phone_mobile']" );

    public static Target INPUT_ALIAS = Target.the( "input text Assign an address alias for future reference" ).
            locatedBy( "//input[@id='alias']" );

    public static Target BTN_REGISTER = Target.the( "Button register" ).
            locatedBy( "//span[normalize-space()='Register']" );

    public static Target MSM_WELCOME = Target.the( "View my message welcome" ).
            locatedBy( "//p[@class='info-account']" );






}
