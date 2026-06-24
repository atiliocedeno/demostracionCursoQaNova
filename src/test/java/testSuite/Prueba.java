package testSuite;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testClass.BusquedaAnimalesGoogle;
import testClass.Logeo;

public class Prueba {

    private WebDriver webDriver;

    private final String URL_QANOVA = "https://qanovagroup.com/piloto/";
    private final String URL_GOOGLE = "https://www.google.cl";

    @BeforeTest
    public void setUp() {

        webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();

        webDriver.manage().timeouts().implicitlyWait(
                Duration.ofSeconds(10)
        );
    }

    @Test
    public void buscarPerroEnGoogle() throws InterruptedException {

        webDriver.get(URL_GOOGLE);

        BusquedaAnimalesGoogle busquedaAnimalesGoogle =
                new BusquedaAnimalesGoogle();

        busquedaAnimalesGoogle.busquedaPerro(webDriver);

        Thread.sleep(5000);
    }

    @Test
    public void PruebaLogin1() {

        webDriver.get(URL_QANOVA);

        Logeo logeo = new Logeo(webDriver);

        logeo.PruebaLogin1(
                "nvivas",
                "qanova"
        );
    }

    @AfterTest
    public void closeDriver() throws InterruptedException {

        Thread.sleep(10000); // 10 segundos

        if (webDriver != null) {
            webDriver.quit();
        }
    }
}