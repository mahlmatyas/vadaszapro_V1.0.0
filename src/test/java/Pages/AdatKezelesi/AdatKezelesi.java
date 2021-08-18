package Pages.AdatKezelesi;

import General.CM;
import General.Meth;
import org.openqa.selenium.WebDriver;

public class AdatKezelesi {

    //properties
    private WebDriver driver;

    //constructor
    public AdatKezelesi(WebDriver driver){
        this.driver = driver;
    }

    //methods
    public String adatKezNyil(){ //probálok a _blank ablakra átmenni és kivenni az url-t
        String URL = "";
        Meth.goWait(CM.ADATKEZELESI,driver).click();

        String winHandleBefore = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
            URL = driver.getCurrentUrl();
        }
        driver.close();
        driver.switchTo().window(winHandleBefore);
        return URL;
    }
}
