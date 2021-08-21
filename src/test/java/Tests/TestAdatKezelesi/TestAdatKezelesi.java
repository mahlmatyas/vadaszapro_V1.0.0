package Tests.TestAdatKezelesi;

import General.CT;
import Pages.AdatKezelesi.AdatKezelesi;
import Pages.IndexPage.IndexPage;
import Tests.TestEnvironment.TestEnv;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestAdatKezelesi extends TestEnv {

    @DisplayName("Adatkezelési nyilatkozat ellenörzése")
    @Test
    void TestAdatKezelesi(){
        IndexPage indexPage = new IndexPage(driver);
        indexPage.hirdFeladaslink();

        AdatKezelesi adatKezelesi = new AdatKezelesi(driver);

        String expected = CT.ADATKEZELESI_PATH;
        String actual = adatKezelesi.adatKezNyil(); // _blank ablakba kell átmennem (sikeresen)

        Assertions.assertEquals(expected,actual);
        Assertions.assertFalse(driver.getPageSource().contains("Nyilatkozat"), "The Statement is not found");
        //A második assert mindig hibás lesz mert csak linkje van, de tartalma nincs a nyilatkozatnak
    }
}