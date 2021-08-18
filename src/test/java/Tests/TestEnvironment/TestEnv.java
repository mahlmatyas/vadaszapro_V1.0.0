package Tests.TestEnvironment;

import General.CT;
import General.Meth;
import Pages.IndexPage.IndexPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestEnv {
    protected WebDriver driver;
    protected IndexPage indexPage;
    protected WebDriverWait wait;

    @BeforeEach
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "C:/webdriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        driver = new ChromeDriver(options);

        indexPage = new IndexPage(driver);

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.navigate().to(CT.INDEX_URL);
        //driver.manage().window().setSize(new Dimension(1920,1080));
        driver.manage().window().maximize();

        Meth.driver = driver;
    }
    /*
    @AfterEach
    //public void TearDown(){
        driver.quit();
    }
    */
}