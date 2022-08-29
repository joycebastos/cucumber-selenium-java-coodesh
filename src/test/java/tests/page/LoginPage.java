package tests.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Base;

public class LoginPage extends Base {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage clicarNoLinkCadastrese() {
        driver.findElement(By.linkText("Cadastre-se")).click();
        return this;
    }


}
