package tests.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Base;

public class HomePage extends Base {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage clicarMenuVerVagas() {
        driver.findElement(By.linkText("Ver Vagas")).click();
        return this;
    }


    public HomePage visualizarLogoCoodesh() {
        driver.findElement(By.xpath("//*[@id=\"logoAndNav\"]/nav/span/a/figure[2]/img")).isDisplayed();
        return this;
    }

    public HomePage clicarMenuBlog() {
        driver.findElement(By.linkText("Blog")).click();
        return this;
    }

    public HomePage clicarBotaoLogin() {
        driver.findElement(By.xpath("//*[@id=\"header-nav-bar\"]/ul/li[3]/a/button")).click();
        return this;
    }
}
