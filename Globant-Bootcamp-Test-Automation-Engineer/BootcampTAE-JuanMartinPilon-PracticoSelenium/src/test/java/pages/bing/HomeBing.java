package pages.bing;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeBing extends BasePage {


    @FindBy(id = "sb_form_q")
    private WebElement barraDeBusqueda;

    public HomeBing(WebDriver driver) {
        super(driver);
    }

    public ResultadosBing buscar(String terminoDeBusqueda) {
        this.barraDeBusqueda.clear();
        this.barraDeBusqueda.sendKeys(terminoDeBusqueda);
        this.barraDeBusqueda.sendKeys(Keys.ENTER);
        return new ResultadosBing(this.getDriver());
    }


}
