package pages.MELI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class ResultadoMELI extends BasePage {

    public ResultadoMELI(WebDriver driver) {
        super(driver);
    }

    public String nombre(){
        return this.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//h1[@class='ui-pdp-title']"))).getText();
    }

    public String descuento(){
        return this.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='andes-money-amount__discount']"))).getText();
    }

    public String precio(){
        String precioprod = this.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@itemprop='priceCurrency']"))).getText();
        return (precioprod += " " + this.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class = 'ui-pdp-price__second-line']//span[@class='andes-money-amount__fraction']"))).getText());
    }

    public String obtenerNombreDeMarca(){
        return this.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//h1[@class= 'ui-search-breadcrumb__title']"))).getText();
    }
}
