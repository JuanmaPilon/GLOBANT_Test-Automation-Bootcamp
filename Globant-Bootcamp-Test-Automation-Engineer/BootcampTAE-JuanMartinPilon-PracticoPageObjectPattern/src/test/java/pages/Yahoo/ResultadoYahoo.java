package pages.Yahoo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class ResultadoYahoo extends BasePage {

    public ResultadoYahoo(WebDriver driver) {
        super(driver);
    }

    public String getResultadoText(int index) {
        if (index > 0 && index <= 10) {
            return this.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='web']/ol/li[\"+ index +\"]/div/div[1]/h3/a"))).getText();
        } else {
            return this.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='web']/ol/li[\"+ index +\"]/div/div[1]/h3/a"))).getText();
        }
    }

}
