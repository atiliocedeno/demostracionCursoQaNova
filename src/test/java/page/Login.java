package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverContext;
import utils.Reporte.EstadoPrueba;
import utils.Reporte.PdfQaNovaReports;
import java.time.Duration;


public class Login {

    @FindBy(xpath = "//*[@id=\"imUname\"]")
    WebElement inputUsuario;

    @FindBy(xpath = "//*[@id=\"imPwd\"]")
    WebElement inputClave;

    @FindBy(xpath = "//*[@id=\"imLogin\"]/form/div[3]/input")
    WebElement btnIngresar;


    WebDriverWait webDriverWait;

    public Login(){

        PageFactory.initElements(DriverContext.getDriver(), this);

        this.webDriverWait = new WebDriverWait(
                DriverContext.getDriver(),
                Duration.ofSeconds(30)
        );
    }

    public void ingresarUsuario(String usuario){

        webDriverWait.until(ExpectedConditions.visibilityOf(inputUsuario));
        PdfQaNovaReports.addWebReportImage("Despliegue Login", "Login desplegado correctamente", EstadoPrueba.PASSED, false);
        inputUsuario.sendKeys(usuario);
    }

    public void ingresarClave(String clave){

        inputClave.sendKeys(clave);
    }

    public void clickBtnIngresar(){
        PdfQaNovaReports.addWebReportImage("Datos Login", "Se ingresa datos login", EstadoPrueba.PASSED, false);
        btnIngresar.click();
    }
}