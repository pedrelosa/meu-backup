package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AcoesSelenium {

    public static void click(WebDriver driver, By by, int espera){
        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(espera))).until(ExpectedConditions.elementToBeClickable(by));
        element.click();
    }

    public WebElement enviarDados(WebDriver driver, By by, String texto, int espera){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(espera));
        wait.until(ExpectedConditions.elementToBeClickable(by));

        WebElement element = driver.findElement(by);

        element.sendKeys(texto);


        return element;
    }

    public String atributo(WebDriver driver, By by, String atribto, int espera){
        String valorObtido = "";

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(espera));
        wait.until(ExpectedConditions.elementToBeClickable(by));

        WebElement element = driver.findElement(by);

        valorObtido = element.getAttribute(atribto);

        return valorObtido;

    }

}
