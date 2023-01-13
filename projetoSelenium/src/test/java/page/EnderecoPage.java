package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.AcoesSelenium;

public class EnderecoPage extends AcoesSelenium{
    WebDriver driver;

    public EnderecoPage(WebDriver driver) {
        this.driver = driver;
    }

    public static By end1 = By.xpath("//intput[@class='ytp-cued-thumbnail-overlay-image']");
    public static By end2 = By.xpath("//img[@class='j0joJb']");

    public void endereco(){
//        click(driver, end1, 10);
//        enviarDados(driver, end1, "Don't Worry, Be Happy", 10);
//        click(driver,end2,10);
    }


}
