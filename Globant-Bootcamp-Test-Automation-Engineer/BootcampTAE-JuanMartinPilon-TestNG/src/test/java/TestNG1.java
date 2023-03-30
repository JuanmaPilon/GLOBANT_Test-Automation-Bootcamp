import org.testng.annotations.*;

public class TestNG1 {

    @BeforeClass
    public void start() {
        System.out.println("Before Class Method");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Test Method");
    }

    @Test
    public void test(){
        System.out.println("Test 1 Method");
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
