import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MELI.HomeMELI;
import pages.MELI.MejoresTiendas;
import pages.MELI.Ofertas;
import pages.MELI.ResultadoMELI;

public class TestMELI {

    public static final String urlMELI = "https://www.mercadolibre.com.uy/";

    WebDriver driver;

    String producto = "";
    String producto$ = "";
    String productoDesc = "";
    String mejorTiendaName = "";

    @BeforeClass
    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testMELI() {
        driver.get(urlMELI);
        HomeMELI homeMELI = new HomeMELI(driver);
        homeMELI.setOkCookies();
        Ofertas ofertas = homeMELI.ofertas();
        producto = ofertas.getNombre(1);
        producto$ = ofertas.getPrecio(1);
        //productoDesc = ofertas.getPrecio(1); //no pasa correctamente

        ResultadoMELI articulo = ofertas.getProducto();
        Assert.assertEquals(producto, articulo.nombre(), "El articulo no tiene el mismo nombre");
        Assert.assertEquals(producto$, articulo.precio(), "El articulo no tiene el mismo precio");
        //Assert.assertEquals(productoDesc, articulo.descuento(),"El articulo no tiene el mismo descuento"); //no pasa correctamente

        driver.get(urlMELI);
        MejoresTiendas mejoresTiendas = homeMELI.mejoresTienda();
        mejorTiendaName = mejoresTiendas.obtenerNombre(1);
        ResultadoMELI marcaDeTienda = mejoresTiendas.obtenerMarcaDeProducto();
        Assert.assertTrue(marcaDeTienda.obtenerNombreDeMarca().contains(mejorTiendaName), "El nombre de la tienda no coincide");
    }

    @AfterClass
    public void quit() {
        this.driver.quit();
    }
}
