package Tests.TestEnvironment;

import General.CT;
import General.Meth;
import Pages.IndexPage.IndexPage;
import General.PrintTestName;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class TestEnv implements PrintTestName {

    protected WebDriver driver;
    protected IndexPage indexPage;

    @BeforeEach
    void SetUp() {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", "C:/webdriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);

        indexPage = new IndexPage(driver);

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.navigate().to(CT.INDEX_URL);
        //driver.manage().window().setSize(new Dimension(1920,1080));
        driver.manage().window().maximize();

        Meth.driver = driver;
    }

    @AfterEach
    void TearDown(){
        driver.quit();
    }
}