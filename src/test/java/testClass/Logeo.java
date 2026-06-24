package testClass;

import java.text.ParseException;

import page.CargaInformacion;
import page.Login;

public class Logeo {

    private Login login;
    private CargaInformacion cargaInformacion;

    public void PruebaLogin1(String username, String password) throws ParseException {

        login = new Login();
        cargaInformacion = new CargaInformacion();

        login.ingresarUsuario(username);
        login.ingresarClave(password);
        login.clickBtnIngresar();

        cargaInformacion.recuperarTitulo();
        cargaInformacion.rellenarCampoTexto("Testeo");
        cargaInformacion.rellenarCampoMail("aaa@aa.com");
        cargaInformacion.rellenarCampoAreaTexto("AAAA");
        cargaInformacion.seleccionarFechaCalendario("2023-03-19");
        cargaInformacion.rellenarCampoLista("valor 3");
        cargaInformacion.selecionMultiple("1,3");
        cargaInformacion.comboRadio(1);
        cargaInformacion.clickBtnEnviar();
    }
}