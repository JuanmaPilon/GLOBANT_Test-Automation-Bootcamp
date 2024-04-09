import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG3 {

    @DataProvider(name = "dataProvider")
    public Object[][] dataProvider() {
        return new Object[][] {{"FIRST ","TEST ","STRING"}, {"SECOND ", "TEST ","STRING"}};
    }

    @BeforeClass
    public void start() {
        System.out.println("Before Class Method");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Test Method");
    }

    @Test(dataProvider = "dataProvider")
    public void test(String primero, String segundo, String tercero) {
        System.out.println(primero);
        Assert.assertEquals(primero,"FIRST", "Todo ok");
    }

    @Test(dataProvider = "dataProvider")
    public void test2(String cuarto, String quinto, String sexto) {
        System.out.println(cuarto);
        Assert.assertNull("cuarto","Error");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Test Method");
    }

    @AfterClass
    public void quit() {
        System.out.println("After Class Method");
    }
}
