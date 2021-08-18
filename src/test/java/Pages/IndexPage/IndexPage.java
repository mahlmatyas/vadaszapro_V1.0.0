package Pages.IndexPage;

import General.CM;
import General.CT;
import General.Meth;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class IndexPage {

    //properties
    public WebDriver driver;

    //constructor
    public IndexPage(WebDriver driver) {
        this.driver = driver;
    }

    //methods
    public void hirdFeladaslink() {
        Meth.goWait(CM.INDEX_NEW_ADVERT, driver).click();
    }

    public void allAdvertLink() {
        Meth.goWait(CM.INDEX_ALL_ADVERT_LINK, driver).click();
    }

    public boolean allAdvertContent(int value) { //megnézem, a hirdetések nem nyomjak e szét az oldalt
        Boolean result = true;
        List<WebElement> advertsCont = driver.findElements(CM.INDEX_ALL_ADVERT_CONTENT);
        for (WebElement advert : advertsCont) {
            if (advert.getText().length() > value) {
                result = false;
            }
        }
        return result;
    }
}