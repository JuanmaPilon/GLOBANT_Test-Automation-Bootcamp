package pages.MELI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class MejoresTiendas extends BasePage {

    public MejoresTiendas(WebDriver driver) {
        super(driver);
    }

    public WebElement marca = obtenerMarca(1);


    private WebElement obtenerMarca(int index){
        if(index<1 || index>10){
            index=1;
        }
        return this.getDriver().findElement(By.xpath("//section[@class = 'results'][1]//div[@class='container-card-logo']["+index+"]"));
    }

    public String obtenerNombre(int index){
        if(index<1 || index>10){
            index=1;
        }
        return this.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//section[@class='results'][1]//div[@class='container-card-logo']["+index+"]//div[@class='image-logo-container']//img"))).getAttribute("alt");
    }


    public ResultadoMELI obtenerMarcaDeProducto(){
        this.getWait().until(ExpectedConditions.elementToBeClickable(marca)).click();
        return new ResultadoMELI(this.getDriver());
    }

}