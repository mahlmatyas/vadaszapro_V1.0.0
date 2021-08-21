package Tests.TestContact;

import General.CT;
import General.Meth;
import Pages.Contact.Contact;
import Tests.TestEnvironment.TestEnv;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestContact extends TestEnv {

    //properties
    private Contact contact;

    @DisplayName("Kontakt formot ellenörzöm bevitt adatokkal")
    @Test
    void TestContact() {
        contact = new Contact(driver);
        contact.contactLink();

        contact.msgSend(
                CT.CONTACT_NAME,
                Meth.phoneGenerator(),
                CT.CONTACT_EMAIL,
                Meth.msgGenerator(),
                CT.CONTACT_CAPTCHA);

        Assertions.assertEquals(CT.CONTACT_URL, driver.getCurrentUrl());
    }
}