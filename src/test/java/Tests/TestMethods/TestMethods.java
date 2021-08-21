package Tests.TestMethods;

import General.Meth;
import General.PrintTestName;
import org.junit.jupiter.api.*;

import java.io.File;

import static java.lang.Integer.parseInt;
import static org.junit.jupiter.api.Assertions.assertAll;

public class TestMethods implements PrintTestName {

    @DisplayName("A generalt szam Range-en belul van-e")
    @Test
    void TestRandNum() {
        int num = parseInt(Meth.randNum());
        Assertions.assertTrue(num >= 1 && num <= 111111110);
    }

    @DisplayName("Telefonszam hossza, tipusa")
    @Test
    void TestphoneGenerator() {
        String phoneNum = Meth.phoneGenerator();
        String last4 = phoneNum.substring(10);
        int x = parseInt(last4);

        assertAll(
                () -> Assertions.assertEquals(14, phoneNum.length()),
                () -> Assertions.assertEquals(4, last4.length())
        );
    }


    @Disabled
    @DisplayName("Modosito fajl letezik es van e tartalma")
    @Test
    void fileExist() {
        File file = new File("src/test/Files/DatasToModifyAdvert.txt");
        int PRICEcontentFromFile = Meth.advertMod().get("price").length();
        assertAll(
                () -> Assumptions.assumeTrue(file.exists()),
                () -> Assertions.assertTrue(PRICEcontentFromFile > 0)
        );
    }
}
