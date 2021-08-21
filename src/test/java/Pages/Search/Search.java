package Pages.Search;

import General.CM;
import General.CT;
import General.Meth;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {

    //properties
    private WebDriver driver;

    //constructor
    public Search(WebDriver driver){
        this.driver = driver;
    }

    //methods
    public void search(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Meth.goWait(CM.SEARCH_INPUT,driver).sendKeys(CT.SEARCH_INPUT_VALUE);
        Meth.goWait(CM.SEARCH_INPUT_BUTTON,driver).click();
    }

}
