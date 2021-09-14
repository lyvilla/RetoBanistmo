package co.com.banistmo.certificacion.reto.tastk;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;

import static co.com.banistmo.certificacion.reto.userinterface.Banistmo.*;
import static co.com.banistmo.certificacion.reto.userinterface.CapitalInteligente.ACTUALIDAD_ECONOMICA;
import static co.com.banistmo.certificacion.reto.userinterface.CapitalInteligente.OPEP;


public class IrALapagina implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(QUITAR_OPCION),
                Click.on(EMPRESAS),
                Click.on(CAPITAL_INTELIGENTE),
                Switch.toNewWindow(),
                Click.on(ACTUALIDAD_ECONOMICA),
                Click.on(OPEP)
                );

    }

    public static IrALapagina capitalEconomica() {
        return Tasks.instrumented(IrALapagina.class);
    }
}
