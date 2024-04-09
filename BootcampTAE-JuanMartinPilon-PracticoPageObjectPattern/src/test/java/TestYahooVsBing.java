import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Bing.HomeBing;
import pages.Bing.ResultadosBing;
import pages.Yahoo.HomeYahoo;
import pages.Yahoo.ResultadoYahoo;

public class TestYahooVsBing {

    public static final String urlbing = "https://www.bing.com/";
    public static final String urlyahoo = "https://www.yahoo.com/";

    WebDriver driver;

    String resultadoBing = "";
    String resultadoYahoo = "";

    @DataProvider(name = "terminosDeBusqueda")
    public Object[][] dataProvider() {
        return new Object[][]{
                {"house"},
                {"dog"},
                {"coffee"}
        };
    }

    @BeforeClass
    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test(dataProvider = "terminosDeBusqueda")
    public void TestYahooVsBing(String buscar) {
        driver.get(urlbing);
        HomeBing homeBing = new HomeBing(driver);
        ResultadosBing resultadosBing = homeBing.buscar(buscar);
        String resultadoBing = resultadosBing.getResultadoText(1);
        System.out.println(resultadoBing.toLowerCase());

        driver.get(urlyahoo);
        HomeYahoo homeYahoo = new HomeYahoo(driver);
        ResultadoYahoo resultadosYahoo = homeYahoo.buscar("");
        String resultadoYahoo = resultadosYahoo.getResultadoText(1);
        System.out.println(resultadoYahoo.toLowerCase());

        Assert.assertEquals(resultadoBing.toLowerCase(), resultadoYahoo.toLowerCase(), "Los resultados no son los mismos");
    }

    @AfterClass
    public void quit() {
        this.driver.quit();
    }
}
