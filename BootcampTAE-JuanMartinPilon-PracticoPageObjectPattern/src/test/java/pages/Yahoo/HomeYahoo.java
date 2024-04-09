package pages.Yahoo;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class HomeYahoo extends BasePage {

    @FindBy(id = "ybar-sbq")
    private WebElement barraDeBusqueda;

    public HomeYahoo(WebDriver driver) {
        super(driver);
    }

    public void HomeYahoo(WebDriver driver) {
    }

    public ResultadoYahoo buscar(String terminoDeBusqueda) {
        this.barraDeBusqueda.clear();
        this.barraDeBusqueda.sendKeys(terminoDeBusqueda);
        this.barraDeBusqueda.sendKeys(Keys.ENTER);
        return new ResultadoYahoo(this.getDriver());
    }

}
