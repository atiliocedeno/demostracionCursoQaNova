package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google {
    @FindBy(className = "gLFyf")
    WebElement inputBuscar;

    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")
    WebElement btnBuscar;

    public Google(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public void ingresarBusqueda (String busqueda) {
        inputBuscar.sendKeys(busqueda);
    }
    public void clickBotonBusqueda() {
        btnBuscar.click();
    }
}
