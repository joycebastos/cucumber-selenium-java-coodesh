package tests.steps;

import cucumber.api.java.Before;
import cucumber.api.java.pt.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.page.CadastroPage;
import tests.page.HomePage;
import tests.page.LoginPage;
import utils.Browser;

import static org.junit.Assert.assertEquals;

public class CriarContaSteps {
    private WebDriver driver = Browser.firefoxBrowsing();
    String url = "https://beta.coodesh.com/";

    @Before
    public void abrirPaginaCoodesh() throws Throwable{
        driver.get(url);
        aceitarCookies();
        new HomePage(driver).clicarBotaoLogin();
    }

    @Dado("^cliquei no botao login$")
    public void cliquei_no_botao_login() throws Throwable {
        new HomePage(driver).clicarBotaoLogin();
    }

    @Dado("^que cliquei no link Cadastre-se$")
    public void que_cliquei_no_link_Cadastre_se() throws Throwable {
        new LoginPage(driver).clicarNoLinkCadastrese();
    }

    @Dado("^preenchi os campo nome completo$")
    public void preenchi_os_campo_nome_completo() throws Throwable {
        new CadastroPage(driver).preencherNomeCompleto();
    }

    @Dado("^preenchi o campo email$")
    public void preenchi_o_campo_email() throws Throwable {
        new CadastroPage(driver).preencherEmail();
    }

    @Dado("^preenchi a senha$")
    public void preenchi_a_senha() throws Throwable {
        new CadastroPage(driver).preencherSenha();
    }

    @Dado("^cliquei em aceitar termos e condicoes$")
    public void cliquei_em_aceitar_termos_e_condicoes() throws Throwable {
        new CadastroPage(driver).clicarAceitarTermos();
    }

    @Quando("^clicar no botao inscreva-se$")
    public void clicar_no_botao_inscreva_se() throws Throwable {
        new CadastroPage(driver).clicarNoBotaoInscrevase();
    }

    public void aceitarCookies(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("onetrust-accept-btn-handler")));
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }

    @Então("^devo ser redirecionada para a tela de onboarding$")
    public void devoSerRedirecionadaParaATelaDeOnboarding() {
        assertEquals("Onboarding", driver.findElement(By.xpath(" /html/body/div[1]/header/div[1]/div/div/h1")).getText());
    }
}
