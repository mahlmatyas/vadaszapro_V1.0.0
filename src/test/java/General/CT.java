package General;

import org.openqa.selenium.By;

public class CT {

    //properties

    //Index
    public static final String INDEX_URL = "https://vadaszapro.net/";
    public static final String INDEX_ALL_ADVERT_URL = "https://vadaszapro.net/osszes-hirdetes/";
    public static final int INDEX_ADVERT_CONTENT_LENGTH = 83;
    public static final String INDEX_ADVERT_TITLE_CONTENT_FILE = "src/test/Files/advert_titles.txt";
    public static final int INDEX_NUMBER_OF_SAVED_TITLES_TO_FILE = 66;


    //Search
    public static final String SEARCH_INPUT_VALUE = "R8";
    public static final String SEARCH_LANDING_URL = "https://vadaszapro.net/ujkereses/1";

    //Login
    public static final String LOGIN_URL = "https://vadaszapro.net/?oldal=hirdeteseim";
    public static final String LOGIN_EMAIL = "matt@mahl.hu";
    public static final String LOGIN_PASSWORD = "l6fa";

    //Hird modositas
    public static final String HIRD_LINK = "//*[@id=\"listtable\"]/tbody/tr[1]/td/table/tbody/tr/td[3]/a";
    //public static final By HIRD_LINK = By.xpath("//*[@id=\"listtable\"]/tbody/tr[2]/td/table/tbody/tr/td[3]/a");

    //kapcsolat
    public static final String CONTACT_URL = "https://vadaszapro.net/kapcsolat";
    public static final String CONTACT_NAME = "John Doe";
    public static final String CONTACT_EMAIL = "president@whitehouse.com";
    public static final String CONTACT_CAPTCHA = Meth.randNum().substring(0,5);

    //regisztracio
    public static final String REG_NAME = "John Doe";
    public static final String REG_TELEFON = Meth.phoneGenerator();
    public static final String REG_EMAIL = CONTACT_EMAIL;
    public static final String REG_PWD= "";
    public static final String REG_PWD_AGAIN = "";
    public static final String REG_ADDRESS = "";
    public static final String REG_WEBSITE = "";
    public static final String REG_INTRODUCE = "";

    //adatkezelési nyilatkozat
    public static final String ADATKEZELESI_PATH = "https://vadaszapro.net/any.pdf";

    //Jelszo emlekezteto
    public static final String NEW_PASSWORD_EMAIL = "matt@mahl.hu";
    public static final String NEW_PASSWORD_ALERT_CONTENT = "Biztos ki akar jelentkezni?";
}
