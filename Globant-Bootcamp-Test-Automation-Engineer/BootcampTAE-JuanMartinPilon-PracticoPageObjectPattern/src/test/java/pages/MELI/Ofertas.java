package pages.MELI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class Ofertas extends BasePage {

    public Ofertas(WebDriver driver) {
        super(driver);
    }

    private WebElement firstElement = element(1);

    public WebElement element (int index){
        if(index<1 || index>10){
            index=1;
        }
        return this.getDriver().findElement(By.xpath("//ol[@class='items_container']//li["+index+"]"));
    }

    public String getNombre(int index){
        if(index<1 || index>10){
            index=1;
        }
        return this.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//ol[@class='items_container']//li["+index+"]//p"))).getText();
    }
    public String getPrecio(int index){
        if(index<1 || index>10){
            index=1;
        }
        return this.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//ol[@class='items_container']//li["+index+"]//div//span//span"))).getText();
    }

    public String getDescuento(int index){
        if(index<1 || index>10){
            index=1;
        }
        return this.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//ol[@class='items_container']//li["+index+"]//div[@class='promotion-item__price-additional-info']//span"))).getText();
    }

    public ResultadoMELI getProducto(){
        this.getWait().until(ExpectedConditions.elementToBeClickable(firstElement)).click();
        return new ResultadoMELI(this.getDriver());
    }
}
