package Tests.TestLogin;

import General.CT;
import General.Meth;
import Pages.Login.Login;
import Tests.TestEnvironment.TestEnv;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestLogin extends TestEnv {

    //properties
    private Login login;

    @DisplayName("A bejelentkezést helyes folyamatát ellenörzöm")
    @Test
    public void TestBelepes() {
        indexPage.hirdFeladaslink();   //Leklikkelem a hirdetés feladás linket a nyitóoldalon

        login = new Login(driver);
        login.belepes(CT.LOGIN_EMAIL, CT.LOGIN_PASSWORD); //belépek

        String expected = driver.getCurrentUrl();
        String actual = CT.LOGIN_URL;

        Assertions.assertEquals(expected,actual,"Error 1 LoginTest");
        Assertions.assertTrue(driver.getPageSource().contains("Kilépés"),"Error 2 LoginTest");
    }
}