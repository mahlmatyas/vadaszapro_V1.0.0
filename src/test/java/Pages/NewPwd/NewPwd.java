package Pages.NewPwd;

import General.CM;
import General.CT;
import General.Meth;
import org.openqa.selenium.WebDriver;

public class NewPwd {

    //properties
    private WebDriver driver;

    //constructor
    public NewPwd(WebDriver driver) {
        this.driver = driver;
    }

    //methods
    public void newPwdLink(){
        Meth.goWait(CM.NEW_PASSWORD_LINK,driver).click(); //ez átvisz az uj jelszókérő oldalra
        Meth.goWait(CM.NEW_PASSWORD_EMAIL,driver).sendKeys(CT.NEW_PASSWORD_EMAIL);
        Meth.goWait(CM.NEW_PASSWORD_BUTTON,driver).click();
    }
}
