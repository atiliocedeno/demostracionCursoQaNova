package testClass;

import org.openqa.selenium.WebDriver;
import page.CargaInformacion;
import page.Login;

public class Logeo {
    private Login login;
    private CargaInformacion cargaInformacion;
    public void PruebaLogin1(String username, String password) {
        login = new Login();
        cargaInformacion = new CargaInformacion();

        login.ingresarUsuario(username);
        login.ingresarClave(password);
        login.clickBtnIngresar();

        cargaInformacion.recuperarTitulo();
        cargaInformacion.rellenarCampoTexto ("Testeo");
        cargaInformacion.rellenarCampoMail("aaa@aa.com") ;
        cargaInformacion.rellenarCampoAreaTexto ("AAAA");
        cargaInformacion.rellenarCampoFecha("02/02/2023");
        cargaInformacion.rellenarCampoLista( "valor 3");
        cargaInformacion.selecionMultiple("1,3");
        cargaInformacion.comboRadio(1);
        cargaInformacion.clickBtnEnviar();
    }
}
