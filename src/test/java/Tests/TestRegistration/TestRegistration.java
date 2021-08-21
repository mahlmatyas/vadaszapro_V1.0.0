package Tests.TestRegistration;

import General.CT;
import Pages.Registration.Registration;
import Tests.TestEnvironment.TestEnv;
import org.junit.jupiter.api.Test;

public class TestRegistration extends TestEnv {

    //properties
    Registration registration;

    @Test
    void TestRegistration(){
        indexPage.hirdFeladaslink(); //Leklikkelem a hirdetés feladás linket a nyitóoldalon

        registration = new Registration(driver);
        registration.registrationLink(); //Leklikkelem a regisztráció gombot
        registration.regFormFill(
                CT.REG_NAME,
                CT.REG_TELEFON,
                CT.REG_EMAIL,
                CT.REG_PWD,
                CT.REG_PWD_AGAIN,
                CT.REG_ADDRESS,
                CT.REG_WEBSITE,
                CT.REG_INTRODUCE,
                CT.CONTACT_CAPTCHA);
    }
}