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
        driver.findElement(CM.CONTACT_NAME).sendKeys(Nev);
        driver.findElement(CM.CONTACT_TELEFON).sendKeys(phoneGenerator);
        driver.findElement(CM.CONTACT_EMAIL).sendKeys(Email);
        driver.findElement(CM.CONTACT_MSG).sendKeys(msgGenerator);
        driver.findElement(CM.CONTACT_CAPTCHA).sendKeys(Captcha);
        driver.findElement(CM.CONTACT_MSGBUTTON).click();
    }
}