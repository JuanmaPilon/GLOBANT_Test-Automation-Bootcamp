import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.bing.HomeBing;
import pages.bing.ResultadosBing;

public class Selenium3 {

    String primerResultadoBing;
    String primerResultadoYahoo;
    WebDriver driver;
    public static final String BING_URL = "https://www.bing.com/";

    @DataProvider(name = "busqueda")
    public Object[][] dataProvider() {
        return new Object[][]{
                {"familia"},
                {"perro"},
                {"casa"}
        };
    }

    @BeforeClass
    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(dataProvider = "busqueda")
    public void testSelenium(String terminoDeBusqueda) {
        driver.get(BING_URL);
        HomeBing homeBing = new HomeBing(this.driver);
        ResultadosBing resultadosBing = homeBing.buscar(terminoDeBusqueda);
        this.primerResultadoBing = resultadosBing.getResultadoText(10);
        System.out.println(this.primerResultadoBing);
        Assert.assertTrue(this.primerResultadoBing.toLowerCase().contains(terminoDeBusqueda.toLowerCase()), "No contiene lo buscado");
    }

    @Test
    public void testYahoo() {
        this.primerResultadoYahoo = "gato";
    }

    @Test
    public void bingVsYahoo() {
        Assert.assertEquals(this.primerResultadoBing, this.primerResultadoYahoo, "No es lo buscado");
    }

    @AfterClass
    public void quit() {
        this.driver.quit();
    }
}