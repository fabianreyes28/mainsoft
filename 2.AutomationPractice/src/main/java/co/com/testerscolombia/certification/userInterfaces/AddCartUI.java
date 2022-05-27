package co.com.testerscolombia.certification.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AddCartUI {
    public static Target LIST_SORT = Target.the( "List sort by" ).
            locatedBy( "(//select[@id='selectProductSort'])[1]" );

    public static Target BTN_ADD_CART = Target.the( "Button add to cart" ).
            locatedBy( "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line hovered']//span[contains(text(),'Add to cart')]" );

    public static Target MSM_ADDED = Target.the( "Msm Product successfully added to your shopping cart" ).
            locatedBy( "//h2[normalize-space()='Product successfully added to your shopping cart']" );


}
