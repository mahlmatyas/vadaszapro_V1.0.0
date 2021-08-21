package General;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;

public interface PrintTestName {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";

    @BeforeEach
    default void PrintTestName(TestInfo testInfo){
        System.out.println(ANSI_GREEN+"Test: "+testInfo.getDisplayName()+ANSI_RESET);
    }
}
