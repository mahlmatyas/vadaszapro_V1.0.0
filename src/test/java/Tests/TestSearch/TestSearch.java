package Tests.TestSearch;

import General.CT;
import Pages.Search.Search;
import Tests.TestEnvironment.TestEnv;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSearch extends TestEnv {

    private Search search;

    @Test
    public void TestSearch(){
        search = new Search(driver);
        search.search();

        String expected = CT.SEARCH_LANDING_URL;
        String actual = driver.getCurrentUrl();
        Assertions.assertEquals(expected,actual);
    }

}
