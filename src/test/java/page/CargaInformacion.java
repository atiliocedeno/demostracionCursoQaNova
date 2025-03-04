package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CargaInformacion {

    WebDriver driver;

    WebDriverWait wait;

    @FindBy(xpath = "//*[@id=\"imPgTitle\"]")
    private WebElement titulo;

    @FindBy(xpath = "//*[@id=\"imObjectForm_1_2\"]")
    private WebElement campoTexto;

    @FindBy(xpath = "//*[@id=\"imObjectForm_1_3\"]")
    private WebElement campoCorreo;

    @FindBy(xpath = "//*[@id=\"imObjectForm_1_4\"]")
    private WebElement campoTextArea;

    @FindBy(xpath = "//*[@id=\"imObjectForm_1_5\"]")
    private WebElement campoFecha;

    @FindBy(xpath = "//*[@id=\"imObjectForm_1_6\"]")
    private WebElement campoLista;

    @FindBy(xpath = "//*[@id=\"imObjectForm_1_7_0\"]")
    private WebElement campoMultiple1;

    @FindBy(xpath = "//*[@id=\"imObjectForm_1_7_1\"]")
    private WebElement campoMultiple2;

    @FindBy(xpath = "//*[@id=\"imObjectForm_1_7_2\"]")
    private WebElement campoMultiple3;

    @FindBy(xpath = "//*[@id=\"imObjectForm_1_8_0\"]")
    private WebElement rbbtnCombo1;

    @FindBy(xpath = "//*[@id=\"imObjectForm_1_8_1\"]")
    private WebElement rbbtnCombo2;

    @FindBy(xpath = "//*[@id=\"imObjectForm_1_8_2\"]")
    private WebElement rbbtnCombo3;

    @FindBy(xpath = "//*[@id=\"imObjectForm_1_submit\"]")
    private WebElement btnEnviar;

    @FindBy(xpath = "//*[@id=\"imObjectForm_1_buttonswrap\"]/input[2]")
    private WebElement btnResetear;

    WebDriver webDriver;

    WebDriverWait webDriverWait;

    public  CargaInformacion(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    public String recuperarTitulo () {
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
        webDriverWait.until(ExpectedConditions.visibilityOf(titulo));
        String texto = titulo.getText();
        return texto;
    }

    public void rellenarCampoTexto(String texto) {
        campoTexto.sendKeys(texto);
    }
    public void rellenarCampoMail(String mail) {
        campoCorreo.sendKeys(mail);
    }
    public void rellenarCampoAreaTexto(String areaTexto) {
        campoTextArea.sendKeys(areaTexto);
    }
    public void rellenarCampoFecha(String fecha) {
        campoFecha.sendKeys(fecha);
    }

    public void rellenarCampoLista(String valor) {
        Select select = new Select(campoLista);
        select.selectByValue(valor);
    }

    public void selecionMultiple(String indicador) {
        String[] indicadores = indicador.split(",");
        for (String nro : indicadores) {
            int numero = Integer.parseInt(nro);
            switch (numero) {
                case 1:
                    campoMultiple1.click();
                    break;
                case 2:
                    campoMultiple2.click();
                    break;
                case 3:
                    campoMultiple3.click();
                    break;
                default:
                    System.out.println("Valor no procesable");
            }
        }
    }
}
