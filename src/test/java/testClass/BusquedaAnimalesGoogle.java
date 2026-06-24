package testClass;

import org.openqa.selenium.WebDriver;
import page.Google;

public class BusquedaAnimalesGoogle {

    private Google google;

    public void busquedaPerro(WebDriver driver) {
        google = new Google(driver);
        google.ingresarBusqueda("Perro");
        google.presionarEnter();
    }

    public void busquedaGato(WebDriver driver) {
        google = new Google(driver);
        google.ingresarBusqueda("Gato");
        google.presionarEnter();
    }
}