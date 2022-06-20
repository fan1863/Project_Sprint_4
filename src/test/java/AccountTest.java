import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountTest {

    private final String name;
    private final boolean expectedResult;

    public AccountTest(String name, boolean expectedResult) {
        this.name = name;
        this.expectedResult = expectedResult;

    }

    @Parameterized.Parameters
    public static Object[][] dataForTest() {
        return new Object[][] {
                {"Тимоти Шалфей", true},
                {" Тимоти Шалфей", false},
                {"Тимоти Шалфей ", false},
                {"ТимотиШалфей", false},
                {"Ти", false},
                {"Тимоти  Шалфей ", false},
                {"Тимоти Шалфей Его Королевское Величество", false},
                {"", false}
        };
    }

    @Test
    public void checkNameTest() {
        Account account = new Account(name);
        Assert.assertEquals(expectedResult, account.checkNameToEmboss());
    }
}
