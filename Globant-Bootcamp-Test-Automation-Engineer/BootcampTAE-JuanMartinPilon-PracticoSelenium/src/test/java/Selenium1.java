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


public class Selenium1 {

    @DataProvider(name = "busquedaEnYahoo")
    public Object[][] dataProvider() {
        return new Object[][]{
                {"rain"},
                {"sun"},
                {"ray"}
        };
    }

    @Test(dataProvider = "busquedaEnYahoo")
    public void testYahoo(String busquedaEnYahoo){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("https://espanol.yahoo.com/?p=us");
        WebElement busquedaYahoo = driver.findElement(By.xpath("//*[@id=\"ybar-sbq\"]"));
        WebElement waitYahoo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ybar-sbq\"]")));
        busquedaYahoo.sendKeys(busquedaEnYahoo);
        busquedaYahoo.sendKeys(Keys.ENTER);
        WebElement primerResultado = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=' d-ib ls-05 fz-20 lh-26 td-hu tc va-bot mxw-100p']")));
        String resultadoYahooText = primerResultado.getText();
        System.out.println(resultadoYahooText);
        Assert.assertTrue(resultadoYahooText.contains(busquedaEnYahoo),"No es lo buscado");
        driver.quit();
    }
}