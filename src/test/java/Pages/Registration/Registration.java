package Pages.Registration;

import General.CM;
import General.Meth;
import org.openqa.selenium.WebDriver;

public class Registration {

    //properties
    private WebDriver driver;

    //constructor
    public Registration(WebDriver driver){
        this.driver = driver;
    }

    //methods
    public void registrationLink() {
        Meth.goWait(CM.REG_REGLINK, driver).click();
    }

    public void regFormFill(String Name,
                    String Telefon,
                    String Email,
                    String Pwd,
                    String PwdAgain,
                    String Address,
                    String Website,
                    String Introduce,
                    String Captcha){
        driver.findElement(CM.CONTACT_NAME).sendKeys(Name);
        driver.findElement(CM.REG_TELEFON).sendKeys(Telefon);
        driver.findElement(CM.CONTACT_EMAIL).sendKeys(Email);
        driver.findElement(CM.REG_PWD1).sendKeys(Pwd);
        driver.findElement(CM.REG_PWD2).sendKeys(PwdAgain);
        driver.findElement(CM.REG_ADDRESS).sendKeys(Address);
        driver.findElement(CM.REG_WEBSITE).sendKeys(Website);
        driver.findElement(CM.REG_INTRODUCE).sendKeys(Introduce);
        driver.findElement(CM.REG_CAPTCHA).sendKeys(Captcha); // CAPTCHA MIATT NEM FUT LE A REGIISZTÁCIO
        driver.findElement(CM.REG_BUTTON).click();
    }
}
