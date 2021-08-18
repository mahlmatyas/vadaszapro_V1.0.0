package General;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class Meth {

    //properties
    public static WebDriver driver;
    private static Random random;
    private static WebDriverWait wait;

    //methods
    public static String getUrl() {
        return driver.getCurrentUrl();
    }

    public static String randNum() {
        random = new Random();
        int num = random.nextInt(111111111);
        return String.valueOf(num);
    }

    public static String msgGenerator() {
        String val = "Ez 10 db generalt uzenetet\n\n";
        for (int i = 0; i < 10; i++) {
            val = val + "Ez a (" + String.valueOf(i + 1) + ") szamu teszt üzenet, random ID-val: " + Meth.randNum() + "\n";
        }
        return val;
    }

    public static String phoneGenerator() {
        random = new Random();
        String numPart_0 = "+36";
        String[] arr = {"20", "30", "70"};
        String numPart_1 = arr[random.nextInt(arr.length)];
        String numPart_2 = Meth.randNum().substring(0, 3);
        String numPart_3 = Meth.randNum().substring(0, 4);
        return numPart_0 + numPart_1 + "/" + numPart_2 + "-" + numPart_3;
    }

    public static WebElement goWait(By value, WebDriver driver) {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(value));
        wait.until(ExpectedConditions.elementToBeClickable(value));
        return driver.findElement(value);
    }

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
}