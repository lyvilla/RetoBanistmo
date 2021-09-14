package co.com.banistmo.certificacion.reto.tastk;

import co.com.banistmo.certificacion.reto.userinterface.Banistmo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {

    private Banistmo banistmo;

   @Override
    public <T extends Actor> void performAs(T theActor) {
       theActor.attemptsTo(Open.browserOn(banistmo));
    }

    public static AbrirPagina Banisitmo(){
        return Tasks.instrumented(AbrirPagina.class);
    }
}
