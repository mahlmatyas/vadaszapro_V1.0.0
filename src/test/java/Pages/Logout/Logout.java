package Pages.Logout;

import General.CM;
import General.Meth;
import org.openqa.selenium.WebDriver;

public class Logout {

    //properties
    private WebDriver driver;

    //constructor
    public Logout(WebDriver driver){
        this.driver = driver;
    }

    //methods
    public String logout(){
        Meth.goWait(CM.LOGOUT_BUTTON, driver).click(); //leklikkelem a kilépés gombot
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Meth.popUpAccept();
    }
}