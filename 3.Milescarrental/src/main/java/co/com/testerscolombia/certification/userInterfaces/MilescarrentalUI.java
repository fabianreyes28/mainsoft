package co.com.testerscolombia.certification.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MilescarrentalUI {
    public static Target TEX_BOX = Target.the("text box airport").
            locatedBy("(//div[@class='form-qs__pickup-location'])[1]/label/input[@data-link='pickupLocation']");

    public static Target FLORIDA = Target.the("City").
            locatedBy("(//li[@class = 'ui-menu-item']/div/span[2][contains(text(), 'Florida')])");

    public static Target CALENDAR = Target.the("Calendar").
            locatedBy("/html[1]/body[1]/div[1]/main[1]/div[1]/form[1]/div[1]/label[1]/input[1]");
    // locatedBy("(//div[@id='form-qs__box20220525193974'])/label[2]/input[@id='to-input20220525193974']");
    public static Target DATE_R = Target.the("Next mont").
            locatedBy("//div[@class='month-item']//div[@class='container__days']/div[28]");
    //locatedBy("/html/body/div[4]/div/div[4]/div/div[1]/div/div/div/div/div[2]/div[3]/div[28]");
    public static Target DATE_D = Target.the("Next mont").
            locatedBy("//div[@class='month-item']//div[@class='container__days']/div[6]");
    public static Target BTN_SEARCH = Target.the("Button search").
            locatedBy("(//i[@class='button__icon icon-search'])[1]");

    public static Target CAR_2 = Target.the("CAR 2").
            locatedBy("(//button[@type='button'][normalize-space()='RESERVAR AHORA'])[2]");

    public static Target NAME = Target.the("Name").
            locatedBy("//input[@id='inpName']");

    public static Target PHONE = Target.the("Phone").
            locatedBy("//input[@id='phoneCustom']");

    public static Target EMAIL = Target.the("Email").
            locatedBy("//input[@id='inpEmail']");

    public static Target BTN_NEXT = Target.the("Button Next").
            locatedBy("//span[normalize-space()='Siguiente']");

 public static Target BTN_PAY = Target.the("Button pay").
            locatedBy("//button[@id='payNow']//span[@class='button__label d-none d-md-inline-block'][normalize-space()='PAGAR AHORA']");


}
