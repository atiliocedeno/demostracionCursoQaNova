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

    public void PruebaLogin1(String username, String password) {
        login = new Login(webDriver);
        cargaInformacion = new CargaInformacion(webDriver);

        login.ingresaUser(username);
        login.ingresaClave(password);
        login.clickBotonLogin();

        cargaInformacion.recuperarTitulo();
        cargaInformacion.rellenarCampoTexto ("Testeo");
        cargaInformacion.rellenarCampoMail("aaa@aa.com") ;
        cargaInformacion.rellenarCampoAreaTexto ("AAAA");
        cargaInformacion.rellenarCampoFecha("02/02/2023");
        cargaInformacion.rellenarCampoLista( "valor 3");
        cargaInformacion.selecionMultiple("1,3");
    }
}
