package tests.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Base;

public class VagasPage extends Base {

    public VagasPage(WebDriver driver) {
        super(driver);
    }

    public VagasPage visualizarTituloFacaLogin(){
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div/div[1]/div/input")).isDisplayed();
        return this;
    }
}
