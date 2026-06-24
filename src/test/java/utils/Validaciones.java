package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Reporte.EstadoPrueba;
import utils.Reporte.PdfQaNovaReports;

import java.time.Duration;

public class Validaciones {

    public static void validarObjeto(WebElement webElement, String descripcionElemento) {

        WebDriverWait webDriverWait = new WebDriverWait(
                DriverContext.getDriver(),
                Duration.ofSeconds(
                        Integer.valueOf(
                                ReadProperties.readFromConfig("Propiedades.properties")
                                        .getProperty("segundosEspera")
                        )
                )
        );

        String identificador;

        try {

            webDriverWait.until(
                    ExpectedConditions.visibilityOf(webElement)
            );

            identificador = webElement.getAttribute("xpath");

            if (identificador == null) {
                identificador = webElement.getAttribute("id");
            }

            System.out.println(
                    "Se despliega correctamente el elemento "
                            + descripcionElemento
                            + ", identificador: "
                            + identificador
            );

            PdfQaNovaReports.addWebReportImage(
                    "Validacion elemento " + descripcionElemento,
                    "Se despliega correctamente el elemento "
                            + descripcionElemento
                            + ", identificador: "
                            + identificador,
                    EstadoPrueba.PASSED,
                    false
            );

        } catch (Exception e) {

            System.out.println(
                    "No se despliega elemento "
                            + descripcionElemento
            );

            PdfQaNovaReports.addWebReportImage(
                    "Validacion elemento " + descripcionElemento,
                    "No se despliega elemento "
                            + descripcionElemento,
                    EstadoPrueba.FAILED,
                    true
            );
        }
    }
}