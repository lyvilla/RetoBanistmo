package co.com.banistmo.certificacion.reto.runners;

;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/descargar_pdf.feature"},
        glue = {"co/com/banistmo/certificacion/reto/stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class DescargarPdf {
}
