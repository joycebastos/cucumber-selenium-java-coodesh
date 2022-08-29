package tests.steps;

import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.page.HomePage;
import tests.page.VagasPage;
import utils.Browser;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class HomeSteps {
    private WebDriver driver = Browser.firefoxBrowsing();
    String url = "https://beta.coodesh.com/";


    @Quando("^acessar a página beta da coodesh$")
    public void acessar_a_página_beta_da_coodesh() throws Throwable {
        driver.get(url);
        aceitarCookies();
    }

    @Então("^devo visualizar a logo da coodesh$")
    public void devo_visualizar_a_logo_da_coodesh() throws Throwable {
        new HomePage(driver).visualizarLogoCoodesh();
    }

    @Então("^devo visualizar a mensagem \"([^\"]*)\"$")
    public void devo_visualizar_a_mensagem(String mensagem) throws Throwable {
        String array[] = new String[3];
        array = mensagem.split(" ");
        assertEquals(array[1]+" "+array[2], driver.findElement(By.xpath("//strong[contains(.,'developers validados')]")).getText());
    }

    @Então("^devo visualizar os menus \"([^\"]*)\", \"([^\"]*)\" e \"([^\"]*)\"$")
    public void devo_visualizar_os_menus_e(String ver_vagas, String blog, String login) throws Throwable {
        assertEquals(ver_vagas, driver.findElement(By.linkText("Ver Vagas")).getText());
        assertEquals(blog, driver.findElement(By.linkText("Blog")).getText());
        assertEquals(login, driver.findElement(By.xpath("//*[@id=\"header-nav-bar\"]/ul/li[3]/a/button")).getText());
    }

    @Dado("^que estou na página inicial da coodesh$")
    public void que_estou_na_página_inicial_da_coodesh() throws Throwable {
        driver.get(url);
        aceitarCookies();
    }

    @Quando("^clicar no menu Ver Vagas$")
    public void clicar_no_menu_Ver_Vagas() throws Throwable {
        new HomePage(driver).clicarMenuVerVagas();
    }

    @Quando("^clicar no menu Blog$")
    public void clicar_no_menu_Blog() throws Throwable {
        new HomePage(driver).clicarMenuBlog();
    }

    @Quando("^clicar no botao login$")
    public void clicar_no_botao_login() throws Throwable {
        new HomePage(driver).clicarBotaoLogin();
    }

    @Então("^devo ser redirecionada para a tela de vagas da codesh$")
    public void devo_ser_redirecionada_para_a_tela_de_vagas_da_codesh() throws Throwable {
        new VagasPage(driver).visualizarTituloFacaLogin();

    }

    @Então("^devo ser redirecionada para a tela do blog da codesh$")
    public void devo_ser_redirecionada_para_a_tela_do_blog_da_codesh() throws Throwable {
        ArrayList<String> aba = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(aba.get(1));
        naoAssinarBlog();
        aceitarCookies();
        assertEquals("Últimas publicações", driver.findElement(By.cssSelector(".archive-featured-title > span:nth-child(1) > strong:nth-child(1)")).getText());
    }

    @Então("^devo ser redirecionada para a tela de login da codesh$")
    public void devo_ser_redirecionada_para_a_tela_de_login_da_codesh() throws Throwable {
        assertEquals("Faça o login", driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[1]/h2")).getText());
    }

    public void aceitarCookies(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("onetrust-accept-btn-handler")));
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }

    public void naoAssinarBlog(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[12]/div/div/div[1]/div[2]")));
        driver.findElement(By.id("onesignal-slidedown-cancel-button")).click();
    }

    @After
    public void closeBrowser() throws Throwable {
        driver.quit();
    }
}
