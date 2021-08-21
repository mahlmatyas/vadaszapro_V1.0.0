package Pages.IndexPage;

import General.CM;
import General.CT;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class IndexGetTitles {

    //properties
    public WebDriver driver;
    public FileWriter write;

    //constructor
    public IndexGetTitles(WebDriver driver) {
        this.driver = driver;
    }

    //methods


    public boolean storeAdvertTitleToFile() {

        boolean index = true, result = false;
        int n = 0, i = 1;

        while (n < 2) {
            if (index){
                driver.navigate().to(CT.INDEX_URL);
                index = false;
            }else{
                driver.navigate().to(CT.INDEX_ALL_ADVERT_URL + n);
            }
            try {
                write = new FileWriter(CT.INDEX_ADVERT_TITLE_CONTENT_FILE,true);
                List<WebElement> titles = driver.findElements(CM.INDEX_ADVERT_CONTENT_TITLE);
                for (WebElement title : titles) {
                    write.append(i+" - "+title.getText()+"\n");
                    i++;
                    result = true;
                }
                n++;
                write.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return result;
    }
}