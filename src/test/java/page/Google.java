package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google {

    @FindBy(name = "q")
    private WebElement inputBuscar;

    public Google(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public void ingresarBusqueda(String busqueda) {
        inputBuscar.sendKeys(busqueda);
    }

    public void presionarEnter() {
        inputBuscar.sendKeys(Keys.ENTER);
    }
}