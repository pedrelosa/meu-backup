package testeCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import page.EnderecoPage;
import utils.GerenciamentoDriver;

import java.util.Scanner;

public class SiteAcesso {

    private WebDriver driver;
    GerenciamentoDriver gerenciamentoDriver;
    EnderecoPage enderecoPage;

    @Before
    public void setup(){
        gerenciamentoDriver = new GerenciamentoDriver();
        driver = GerenciamentoDriver.browser("chrome");
        enderecoPage = new EnderecoPage(driver);

    }

    @Test
    public void siteAcesso() throws InterruptedException {
        driver.get("https://www.youtube.com/watch?v=d-diB65scQU");
        Thread.sleep(1000);
        driver.get("https://www.youtube.com/results?search_query=api+automation+java");
//        enderecoPage.endereco();
    }

    @After
    public void fim(){
//        driver.quit();
    }

}
