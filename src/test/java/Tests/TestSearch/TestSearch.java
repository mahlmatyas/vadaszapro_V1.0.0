package Tests.TestSearch;

import General.CM;
import General.CT;
import General.Meth;
import Pages.Search.Search;
import Tests.TestEnvironment.TestEnv;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class TestSearch extends TestEnv {

    private Search search;

    @DisplayName("Keresés URL")
    @Test
    void TestSearchUrl(){
        search = new Search(driver);
        search.search();

        String expected = "https://vadaszapro.net/ujkereses/1";
        String actual = driver.getCurrentUrl();

        Assertions.assertEquals(expected,actual);
    }

    @DisplayName("Keresés értékére")
    @Test
    void TestSearchValue(){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Meth.goWait(By.className("sb_input"),driver).sendKeys("vizsla");
        Meth.goWait(CM.SEARCH_INPUT_BUTTON,driver).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String searchContent = Meth.goWait(CM.SEARCH_INPUT,driver).getAttribute("value");
        String searchFound = Meth.goWait(By.className("ctitle"),driver).getText();

        Assertions.assertEquals("vizsla",searchContent);
        Assertions.assertEquals("db Találat -",searchFound.substring(searchFound.length()-12));
    }


}
