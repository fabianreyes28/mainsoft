package co.com.testerscolombia.certification.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BrowseTabUI {
    public static Target TAB_DRESSES = Target.the( "Tab dresses " ).
            locatedBy( "//*[@id=\"block_top_menu\"]/ul/li[2]/a" );

    public static Target CATEGORY_DRESSES = Target.the( "Category dresses " ).
            locatedBy( "//span[@class='category-name']" );




}
