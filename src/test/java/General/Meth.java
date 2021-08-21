package General;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Meth {

    //properties
    public static WebDriver driver;
    private static Random random;
    private static WebDriverWait wait;

    //methods
    public static String getUrl() {
        return driver.getCurrentUrl();
    }

    //Kapcsolat
    public static String randNum() {
        random = new Random();
        int num = random.nextInt(111111111);
        return String.valueOf(num);
    }
    //Kapcsolat
    public static String msgGenerator() {
        String val = "Ez 10 db generalt uzenetet\n\n";
        for (int i = 0; i < 10; i++) {
            val = val + "Ez a (" + String.valueOf(i + 1) + ") szamu teszt üzenet, random ID-val: " + Meth.randNum() + "\n";
        }
        return val;
    }

    //Kapcsolat
    public static String phoneGenerator() {
        random = new Random();
        String numPart_0 = "+36";
        String[] arr = {"20", "30", "70"};
        String numPart_1 = arr[random.nextInt(arr.length)];
        String numPart_2 = Meth.randNum().substring(0, 3);
        String numPart_3 = Meth.randNum().substring(0, 4);
        return numPart_0 + numPart_1 + "/" + numPart_2 + "-" + numPart_3;
    }

    //altalanos
    public static WebElement goWait(By value, WebDriver driver) {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(value));
        wait.until(ExpectedConditions.elementToBeClickable(value));
        return driver.findElement(value);
    }

    //belepes
    public static String popUpAccept() {
        wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.alertIsPresent());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String cnt = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return cnt;
    }

    //hirdetes modositas
    public static HashMap<String, String> advertMod() {
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
}