package Tests.TestNewPwd;

import Pages.IndexPage.IndexPage;
import Pages.NewPwd.NewPwd;
import Tests.TestEnvironment.TestEnv;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestNewPwd extends TestEnv {

    @DisplayName("Ellenörzöm a jelszóemlékeztető helyes működését")
    @Test
    void TestNewPwd(){
        IndexPage indexPage = new IndexPage(driver);
        indexPage.hirdFeladaslink(); // leklikkelem a hird feladás linket

        NewPwd newPwd = new NewPwd(driver);
    }
}
