package pages.MELI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class HomeMELI extends BasePage {

    public HomeMELI(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//a[contains(text(), 'Ofertas')]")
    private WebElement urlOfertas;

    @FindBy(id = "view-more")
    private WebElement urlMejoresTiendas;

    @FindBy(xpath = "//button[@data-testid='action:understood-button']")
    private WebElement okCookies;

    public void setOkCookies() {
        this.getWait().until(ExpectedConditions.elementToBeClickable(this.okCookies)).click();
    }

    public Ofertas ofertas(){
        this.getWait().until(ExpectedConditions.elementToBeClickable(urlOfertas)).click();
        return new Ofertas(this.getDriver());
    }

    public MejoresTiendas mejoresTienda() {
        this.getWait().until(ExpectedConditions.elementToBeClickable(urlMejoresTiendas)).click();
        return new MejoresTiendas(this.getDriver());
    }
}