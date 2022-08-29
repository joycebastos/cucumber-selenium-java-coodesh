package tests.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Base;

public class CadastroPage extends Base {
    public CadastroPage(WebDriver driver) {
        super(driver);
    }

    public CadastroPage preencherNomeCompleto() {
        driver.findElement(By.id("displayName")).sendKeys("ana maria dos santos");
        return this;
    }

    public CadastroPage preencherEmail() {
        driver.findElement(By.id("email")).sendKeys( Math.round(5)+"@yopmail.com");
        return this;
    }

    public CadastroPage preencherSenha() {
        driver.findElement(By.id("password")).sendKeys( Math.round(5)+"1233@BcD");
        return this;
    }

    public CadastroPage clicarAceitarTermos() {
        driver.findElement(By.id("privacy.gpdr")).click();
        return this;
    }

    public CadastroPage clicarNoBotaoInscrevase() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/form/div[5]/div/button")).click();
        return this;
    }
}
