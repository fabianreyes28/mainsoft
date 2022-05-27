package co.com.testerscolombia.certification.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SearchDressesUI {
    public static Target INPUT_SEARCH = Target.the( "Enter search" ).
            locatedBy( "//input[@id='search_query_top']" );

    public static Target BTN_SEARCH = Target.the( "Button search" ).
            locatedBy( "//button[@name='submit_search']" );

    public static Target MSM_RESULT_DRESSES = Target.the( "Msm result dresses" ).
            locatedBy( "//span[@class='heading-counter']" );
}
