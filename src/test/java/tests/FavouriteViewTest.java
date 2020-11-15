package tests;

import base.BaseTest;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pages.ColumnDictionaryPage;

public class FavouriteViewTest extends BaseTest {

    @Test
    public void favouriteViewTest(){
        dashboard.clickDataCatalog();
        ColumnDictionaryPage columnDictionary = dashboard.clickColumnDictionary();
        Reporter.log("Column Dictionary Page Opened.");
        columnDictionary.openViewsList();
        columnDictionary.markFavourite("Test_Edited");
    }
}
