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

public class SeleniumExample {

    String primerResultadoBing;
    String primerResultadoYahoo;
    WebDriver driver;
    public static final String BING_URL = "https://www.bing.com/";

    @DataProvider(name = "terminosDeBusqueda")
    public Object[][] dataProvider() {
        return new Object[][]{
                {"bicicleta"},
                {"auto"},
                {"camión"}
        };
    }

    @BeforeClass
    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(dataProvider = "terminosDeBusqueda")
    public void testSelenium(String terminoDeBusqueda) {
        driver.get(BING_URL);
        HomeBing homeBing = new HomeBing(this.driver);
        ResultadosBing resultadosBing = homeBing.buscar(terminoDeBusqueda);
        this.primerResultadoBing = resultadosBing.getResultadoText(2);
        System.out.println(this.primerResultadoBing);
        Assert.assertTrue(this.primerResultadoBing.toLowerCase().contains(terminoDeBusqueda.toLowerCase()), "El primer resultado no contiene el termino de busqueda");
    }

    @Test
    public void testYahoo() {
        this.primerResultadoYahoo = "hola";
    }

    @Test
    public void bingVsYahoo() {
        Assert.assertEquals(this.primerResultadoBing, this.primerResultadoYahoo, "Los resultados son distintos");
    }

    @AfterClass
    public void quit() {
        this.driver.quit();
    }


}
