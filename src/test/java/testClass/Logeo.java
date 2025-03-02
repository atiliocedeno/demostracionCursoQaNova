package testClass;

import org.openqa.selenium.WebDriver;
import page.CargaInformacion;
import page.Login;

public class Logeo {

    private Login login;
    private CargaInformacion cargaInformacion;
    private WebDriver webDriver;

    // Constructor correcto
    public Logeo(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void pruebalogin1(String username, String password) {
        login = new Login(webDriver);
        cargaInformacion = new CargaInformacion(webDriver);

        login.ingresaUser(username);
        login.ingresaClave(password);
        login.clickBotonLogin();

        cargaInformacion.recuperarTitulo();
    }
}
