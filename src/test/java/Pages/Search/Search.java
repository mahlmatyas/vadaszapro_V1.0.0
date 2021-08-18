package Pages.Search;

import General.CM;
import General.CT;
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
        driver.findElement(CM.SEARCH_INPUT).sendKeys(CT.SEARCH_INPUT_VALUE);
        driver.findElement(CM.SEARCH_INPUT_BUTTON).click();
    }

}
