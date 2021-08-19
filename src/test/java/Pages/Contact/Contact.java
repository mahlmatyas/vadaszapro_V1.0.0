package Pages.Contact;

import General.CM;
import General.Meth;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class Contact {

    //properties
    private WebDriver driver;
    private Random rand;

    //constructor
    public Contact(WebDriver driver) {
        this.driver = driver;
    }

    //methods
    public void contactLink() {
        //Meth.wait = new WebDriverWait(driver,10);
        //Meth.wait.until(ExpectedConditions.visibilityOfElementLocated(kapcsolatLink));
        // Meth.wait.until(ExpectedConditions.elementToBeClickable(kapcsolatLink));

        Meth.goWait(CM.CONTACT_LINK,driver).click();
    }

    public void msgSend(String Nev, String phoneGenerator, String Email, String msgGenerator, String Captcha){
        Meth.goWait(CM.CONTACT_NAME,driver).sendKeys(Nev);
        Meth.goWait(CM.CONTACT_TELEFON,driver).sendKeys(phoneGenerator);
        Meth.goWait(CM.CONTACT_EMAIL,driver).sendKeys(Email);
        Meth.goWait(CM.CONTACT_MSG,driver).sendKeys(msgGenerator);
        Meth.goWait(CM.CONTACT_CAPTCHA,driver).sendKeys(Captcha);
        Meth.goWait(CM.CONTACT_MSGBUTTON,driver).click();
    }
}