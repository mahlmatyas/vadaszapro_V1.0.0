package Tests.TestLogout;

import General.CT;
import Pages.IndexPage.IndexPage;
import Pages.Login.Login;
import Pages.Logout.Logout;
import Tests.TestEnvironment.TestEnv;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestLogout extends TestEnv {

    //properties
    private IndexPage indexPage;
    private Login login;
    private Logout logout;

    @DisplayName("Belépés után a szabályos kijelentkezést ellenörzöm")
    @Test
    void TestLogout(){
        indexPage = new IndexPage(driver);
        indexPage.hirdFeladaslink(); //hird feladas linket leklikkelem

        login = new Login(driver);
        login.belepes(CT.LOGIN_EMAIL, CT.LOGIN_PASSWORD); //belépek az oldalra

        logout = new Logout(driver); //Az assert-ben lépek ki és hasonlítom össze a visszaadott stringet

        Assertions.assertEquals(CT.NEW_PASSWORD_ALERT_CONTENT,logout.logout());
    }
}