package pages.Bing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class ResultadosBing extends BasePage {

    public ResultadosBing(WebDriver driver) {
        super(driver);
    }

    public String getResultadoText(int index) {
        if (index > 0 && index <= 10) {
            return this.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("(//ol[@id='b_results']//h2)[" + index + "]"))).getText();
        } else {
            return this.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("(//ol[@id='b_results']//h2)[1]"))).getText();
        }
    }
}