package General;

import org.openqa.selenium.By;

public class CM {

    //IndexPage
    public static final By INDEX_NEW_ADVERT = By.xpath("//*[@id=\"bluemenu\"]/ul[2]/li[5]/a");
    public static final By INDEX_ALL_ADVERT_LINK = By.xpath("//a[@href='osszes-hirdetes/1']");
    public static final By INDEX_ALL_ADVERT_CONTENT = By.xpath("//*[contains(@class,'ctext')]");
    //public static final By INDEX_ADVERT_NEXT_BUTTON = By.cssSelector("//span[8]/a");
    public static final String INDEX_ADVERT_NEXT_URL = "https://vadaszapro.net/osszes-hirdetes/";
    public static final By INDEX_ADVERT_CONTENT_TITLE = By.xpath("//*[contains(@class,'newstitle')]//a");

    //Search
    public static final By SEARCH_INPUT = By.xpath("//*[contains(@class,'sb_input')]");
    public static final By SEARCH_INPUT_BUTTON = By.xpath("//*[contains(@class,'sb_search')]");

    //Contact
    public static final By CONTACT_LINK = By.xpath("//*[contains(@href,'kapcsolat')]");
    public static final By CONTACT_NAME = By.xpath("//*[@id=\'Név\']");
    public static final By CONTACT_EMAIL = By.xpath("//*[@id=\'Email\']");
    public static final By CONTACT_TELEFON = By.xpath("//*[@id=\'no_req\']");
    public static final By CONTACT_MSG = By.xpath("//*[@id=\'Üzenet\']");
    public static final By CONTACT_CAPTCHA = By.xpath("//*[@id=\'Kód\']");
    public static final By CONTACT_MSGBUTTON = By.xpath("//*[@id=\'submit\']");

    //Registration
    public static final By REG_REGLINK = By.xpath("//*[@id='submit_reg']");
    public static final By REG_NAME = By.xpath("//*[@id='Név']");
    public static final By REG_TELEFON = By.xpath("//*[@id='Telefon']");
    public static final By REG_EMAIL = By.xpath("//*[@id='Email']");
    public static final By REG_PWD1 = By.xpath("//*[@id='Jelszó']");
    public static final By REG_PWD2 = By.xpath("//*[@id='Jelszó újra']");
    public static final By REG_ADDRESS = By.xpath("//*[@id='Jelszó újra']");
    public static final By REG_WEBSITE = By.xpath("//*[@id='no_req']");
    public static final By REG_INTRODUCE = By.xpath("//*[@id='Bemutatkozás']");
    public static final By REG_CAPTCHA = By.xpath("//*[@id='Kód']");
    public static final By REG_CHECKBOX = By.xpath("//*[@id='Használati feltételek']");
    public static final By REG_BUTTON = By.xpath("//*[@id='submit']");

    //hird modositas
    public static final By ADVERT_LINK = By.xpath("//*[@id=\"listtable\"]/tbody/tr[1]/td/table/tbody/tr/td[3]/a");
    public static final By ADVERT_SERIAL = By.xpath("//*[@id=\"no_req_gyariszam\"]");
    public static final By ADVERT_YEAR_INPUT = By.xpath("//*[@name=\"evjarat\"]");
    public static final By ADVERT_YEAR_BUTTON = By.xpath("/html/body/center/center/table[2]/tbody/tr/td[1]/div/div[2]/center/form/table/tbody/tr[9]/td[2]/button");
    public static final By ADVERT_TEXTAREA = By.xpath("//*[@name=\"text\"]");
    public static final By ADVERT_PRICE = By.xpath("//*[@name=\"price\"]");
    public static final By ADVERT_WEBSITE = By.xpath("//*[@name=\"weboldal\"]");
    public static final By ADVERT_VIDEO = By.xpath("//*[@name=\"video\"]");
    public static final By ADVERT_BUTTON = By.xpath("//*[@id=\"submit\"]");
    public static final String ADVERT_DATA_FILE = "src/test/Files/DatasToModifyAdvert.txt";

    //Login
    public static final By LOGIN_EMAIL = By.xpath("//*[@id=\"Email\"]");
    public static final By LOGIN_PASSWORD = By.xpath("//*[@id=\"Jelszó\"]");
    public static final By LOGIN_BUTTON = By.xpath("//*[@id=\"submit\"]");

    //logout
    public static final By LOGOUT_BUTTON = By.xpath("//*[@id=\"bluemenu\"]/ul[2]/li[17]/a");

    //adatkezelési nyilatkozat
    public static final By ADATKEZELESI = By.xpath("//*[contains(@href,'any.pdf')]");
    public static final String ADATKEZELESI_PATH = "https://vadaszapro.net/any.pdf";

    //Jelszo emlekezteto
    public static final By NEW_PASSWORD_LINK = By.xpath("//*[contains(@href,'emlekezteto')]");
    public static final By NEW_PASSWORD_EMAIL = By.id("email");
    public static final By NEW_PASSWORD_BUTTON = By.id("submit");
}