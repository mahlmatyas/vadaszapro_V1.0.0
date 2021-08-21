package Pages.AdvertModify;

import General.CM;
import General.Meth;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class AdvertModify {

    //properties
    public WebDriver driver;
    public Select select;

    //constructor
    public AdvertModify(WebDriver driver) {
        this.driver = driver;
    }

    //methods
    public void advertModify() {
        Meth.goWait(CM.ADVERT_LINK, driver).click(); //klikkelek a hird belső linkjére
    }

    public void dropGyarto() {
        select = new Select(driver.findElement(By.xpath("//*[@id=\"gyarto-select\"]//select")));
        //select.selectByValue();
    }

    public void modify() {
        Meth.goWait(CM.ADVERT_SERIAL, driver).sendKeys(Meth.randNum());
        Meth.goWait(CM.ADVERT_YEAR_BUTTON, driver).click();
        Meth.goWait(CM.ADVERT_YEAR_INPUT, driver).sendKeys(Meth.advertMod().get("year"));
        Meth.goWait(CM.ADVERT_TEXTAREA, driver).sendKeys(Meth.advertMod().get("text"));
        Meth.goWait(CM.ADVERT_PRICE, driver).sendKeys(Meth.advertMod().get("price"));
        Meth.goWait(CM.ADVERT_WEBSITE, driver).sendKeys(Meth.advertMod().get("website"));
        Meth.goWait(CM.ADVERT_VIDEO, driver).sendKeys(Meth.advertMod().get("video"));
        //Meth.goWait(CM.ADVERT_BUTTON, driver).click(); //nem nyomok rá a gombra mert nem akarom a hirdetést átírni
    }
}