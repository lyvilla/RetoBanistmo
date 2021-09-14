package co.com.banistmo.certificacion.reto.stepdefinitions;

import co.com.banistmo.certificacion.reto.tastk.AbrirPagina;
import co.com.banistmo.certificacion.reto.tastk.IrALapagina;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DescargaPdf {
    @Managed(driver = "chrome")
    WebDriver driver;

    private static final String LISNEY ="Lisney";


    @Dado("^que el usuario se encuentra en la pagina del banco banitmo$")
    public void queElUsuarioSeEncuentraEnLaPaginaDelBancoBanitmo() {
       theActorCalled(LISNEY).wasAbleTo(AbrirPagina.Banisitmo());
    }

    @Cuando("^el usuario descargue el pdf$")
    public void elUsuarioDescargueElPdf() {
        theActorInTheSpotlight().attemptsTo(IrALapagina.capitalEconomica());
    }

    @Entonces("^debera ver el nombre$")
    public void deberaVerElNombre() {

    }
}
