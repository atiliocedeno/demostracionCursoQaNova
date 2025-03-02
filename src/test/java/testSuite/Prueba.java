package testSuite;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import testClass.Logeo;

public class Prueba {
    private WebDriver webDriver;
    private final String URL = "https://qanovagroup.com/piloto/";

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "driverNavegador/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.get(URL);
    }

    @AfterTest
    public void closeDriver() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }

    @Test
    public void pruebaLogin1() {
        Logeo logeo = new Logeo(webDriver);
        logeo.pruebalogin1("nvivas", "qanova");
    }
}
