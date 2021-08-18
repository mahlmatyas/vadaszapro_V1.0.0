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
        try {
            Meth.goWait(CM.ADVERT_LINK, driver).click(); //klikkelek a hird belső linkjére
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void dropGyarto() {
        select = new Select(driver.findElement(By.xpath("//*[@id=\"gyarto-select\"]//select")));
        //select.selectByValue();
    }

    public HashMap<String, String> advertMod() {
        HashMap<String, String> datas = new HashMap<>();
        {
            try {
                Scanner scanner = new Scanner(new File(CM.ADVERT_DATA_FILE));
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] data = line.split(" = ");
                    datas.put(data[0], data[1]);
                }
                scanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return datas;
    }

    public void modify() {
        try {
            Meth.goWait(CM.ADVERT_SERIAL, driver).sendKeys(Meth.randNum());
            Meth.goWait(CM.ADVERT_YEAR_BUTTON,driver).click();
            Meth.goWait(CM.ADVERT_YEAR_INPUT,driver).sendKeys(advertMod().get("year"));
            Meth.goWait(CM.ADVERT_TEXTAREA,driver).sendKeys(advertMod().get("text"));
            Meth.goWait(CM.ADVERT_PRICE,driver).sendKeys(advertMod().get("price"));
            Meth.goWait(CM.ADVERT_WEBSITE,driver).sendKeys(advertMod().get("website"));
            Meth.goWait(CM.ADVERT_VIDEO,driver).sendKeys(advertMod().get("video"));
            Thread.sleep(5000);
            //Meth.goWait(CM.ADVERT_BUTTON, driver).click(); //nem nyomok rá a gombra mert nem akarom a hirdetést átírni
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}