package Tests.TestIndexPage;

import General.CT;
import Pages.IndexPage.IndexGetTitles;
import Pages.IndexPage.IndexPage;
import Tests.TestEnvironment.TestEnv;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TestIndexPage extends TestEnv {

    private IndexPage indexPage;
    private IndexGetTitles indexGetTitles;

    @DisplayName("Klikkelek az összes hirdetés linkre a nyitóoldalon")
    @Test
    public void TestIndexPage() {
        indexPage = new IndexPage(driver);
        indexPage.allAdvertLink();

        //String expected = driver.getCurrentUrl();
        //String actual = CT.INDEX_ALL_ADVERT_URL;

        //Assertions.assertEquals(expected, actual, "Error 1 TestIndex");
        Assertions.assertTrue(driver.getPageSource().contains("Összes hirdetés"), "Error 2 TestIndex");
    }

    @DisplayName("Ellenörzöm hirdetés nem nyomja-e szét az oldalt")
    @Test
    public void TestAllAdvertContent() { //
        indexPage = new IndexPage(driver);
        indexPage.allAdvertContent(CT.INDEX_ADVERT_CONTENT_LENGTH);
        Assertions.assertTrue(indexPage.allAdvertContent(CT.INDEX_ADVERT_CONTENT_LENGTH));
    }

    @DisplayName("Mentem a hirdetések címét egy fájlba, majd ráellenörzök dbszám szerint")
    @Test
    public void TestSaveAdvertTitleToFile() {
        indexPage = new IndexPage(driver);
        indexPage.allAdvertLink();


        File file = new File(CT.INDEX_ADVERT_TITLE_CONTENT_FILE);
        if (file.exists()) {
            file.delete(); //vizsgálat elött törlöm a fájlt
        }

        indexGetTitles = new IndexGetTitles(driver);
        Boolean saveBool = indexGetTitles.storeAdvertTitleToFile(); //eltárolom a feltöltést mint boolean
        if (saveBool){
            System.out.println("\nFile successfully created: "+CT.INDEX_ADVERT_TITLE_CONTENT_FILE);
        }

        int i = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(CT.INDEX_ADVERT_TITLE_CONTENT_FILE));
            while (reader.readLine() != null) {
                i++;
            }
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Number of lines: "+i);

        Assertions.assertTrue(saveBool); // vizsgálom hogy a mentés helyesen lefutott
        Assertions.assertEquals(CT.INDEX_NUMBER_OF_SAVED_TITLES_TO_FILE,i);
    }
}