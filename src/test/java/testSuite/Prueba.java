package testSuite;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testClass.BusquedaAnimalesGoogle;
import testClass.Logeo;
import utils.Constants.Navegador;
import utils.DriverContext;
import utils.Reporte.PdfQaNovaReports;

public class Prueba {

    ChromeDriver webDriver;

    String url = "http://www.qanovagroup.com/piloto";

    @BeforeTest
    public void setUp(){

        DriverContext.setUp(Navegador.Chrome, url);

        PdfQaNovaReports.createPDF();
    }

    @AfterTest
    public void closeDriver(){

        DriverContext.closeDriver();

        PdfQaNovaReports.closePDF();
    }

    @Test
    public void PruebaLogin1() {

        DriverContext.getDriver().get(url);

        Logeo logeo = new Logeo();

        logeo.PruebaLogin1(
                "nvivas",
                "qanova"
        );
    }

    /* "Variables antiguas - primeros ejerciciones"
    private final String URL_QANOVA = "https://qanovagroup.com/piloto/";
    private final String URL_GOOGLE = "https://www.google.cl";*/

    /* PRIMEROS EJERCICIOS

    @BeforeTest
    public void setUp() {
        DriverContext.setUp(Navegador.Chrome,URL_GOOGLE);
    }

    @Test
    public void buscarPerroEnGoogle() throws InterruptedException {

        webDriver.get(URL_GOOGLE);

        BusquedaAnimalesGoogle busquedaAnimalesGoogle =
                new BusquedaAnimalesGoogle();

        busquedaAnimalesGoogle.busquedaPerro(webDriver);

        Thread.sleep(5000);
    }*/

}