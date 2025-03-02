package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    @FindBy(xpath = "//*[@id=\"imUname\"]")
    WebElement inputUsername;

    @FindBy(xpath = "//*[@id=\"imPwd\"]")
    WebElement inputPassword;


    @FindBy(xpath = "//*[@id=\"imLogin\"]/form/div[3]/input")
    WebElement btnLogin;


    public Login(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public void ingresaUser (String usuario) {
        inputUsername.sendKeys(usuario);
    }

    public void ingresaClave (String clave) {
        inputPassword.sendKeys(clave);
    }
    public void clickBotonLogin() {
        btnLogin.click();
    }
}
