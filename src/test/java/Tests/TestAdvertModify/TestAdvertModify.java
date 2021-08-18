package Tests.TestAdvertModify;

import General.CT;
import General.Meth;
import Pages.AdvertModify.AdvertModify;
import Pages.Login.Login;
import Tests.TestEnvironment.TestEnv;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class TestAdvertModify extends TestEnv {

    //properties
    public AdvertModify advertModify;
    public Login login;

    @DisplayName("Belépek egy hirdetésbe amit modosítok")
    @Test
    public void TestHirdModositas() {
        indexPage.hirdFeladaslink();   //Leklikkelem a hirdetés feladás linket a nyitóoldalon

        login = new Login(driver);
        login.belepes(CT.LOGIN_EMAIL, CT.LOGIN_PASSWORD); //belépek
        //Meth.popUpClose();

        String expected = driver.getCurrentUrl();
        String actual = CT.LOGIN_URL;

        advertModify = new AdvertModify(driver);
        advertModify.advertModify(); //kiválasztom a hirdetést modosításra
        advertModify.modify(); //modositom az adatokat a beolvasott fájlból (DatasToModifyAdvert.txt)

        Assertions.assertEquals(expected, actual,"Error_3");
        Assertions.assertTrue(driver.getPageSource().contains("Kilépés"),"Error_4");
    }
}