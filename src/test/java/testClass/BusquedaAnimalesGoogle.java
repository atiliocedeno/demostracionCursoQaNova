package testClass;

import org.openqa.selenium.WebDriver;
import page.Google;

public class BusquedaAnimalesGoogle {

    private Google google;

    public void busquedaPerro(WebDriver driver) {
        google = new Google(driver); // Usar el parámetro "driver"
        google.ingresarBusqueda("Perro");
        google.clickBotonBusqueda();
    }

    public void busquedaGato(WebDriver driver) {
        google = new Google(driver); // Usar el parámetro "driver"
        google.ingresarBusqueda("Gato");
        google.clickBotonBusqueda();
    }
}

