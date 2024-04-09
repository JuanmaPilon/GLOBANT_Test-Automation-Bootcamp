import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Selenium2 {

    @DataProvider(name = "busquedaEnBing")
    public Object[][] dataProvider() {
        return new Object[][]{
                {"sky"},
                {"cloud"},
                {"star"}
        };
    }

    @Test(dataProvider = "busquedaEnBing")
    public void testBing(String busquedaEnBing){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("https://www.bing.com/?toWww=1&redig=1084CC767777426081808C926A91F21A");
        WebElement busquedaBing = driver.findElement(By.xpath("//*[@id=\"sb_form_q\"]"));
        WebElement waitBing = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sb_form_q\"]")));
        busquedaBing.sendKeys(busquedaEnBing);
        busquedaBing.sendKeys(Keys.ENTER);
        WebElement primerResultado = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"b_results\"]/li[1]/h2")));
        String resultadoBingText = primerResultado.getText();
        System.out.println(resultadoBingText);
        Assert.assertTrue(resultadoBingText.toLowerCase().contains(busquedaEnBing), "No es lo buscado");
        driver.quit();
    }
}