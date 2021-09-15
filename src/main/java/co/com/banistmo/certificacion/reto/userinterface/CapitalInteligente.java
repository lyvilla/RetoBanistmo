package co.com.banistmo.certificacion.reto.userinterface;

import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class CapitalInteligente {


    public static final Target ACTUALIDAD_ECONOMICA= Target.the("Click en la opcion actualidad economica")
            .locatedBy("//*[@id='bs-example-navbar-collapse-1']/ul/li[2]/a");

    public static final Target VERMAS =Target.the("Click en la opcion empresas")
            .located(By.id("verMas"));


    public static final Target OPEP= Target.the("Click en la opcion actualidad economica")
            .locatedBy("//div[@id='capital_inteligente']/div[1]/div[18]/div[2]/h2/a");

    public static final Target DESCARGAR_PDF= Target.the("Click en la opcion actualidad economica")
            .locatedBy("//*[@id='main-content']/div[2]/div[1]/div/div[1]/p[15]/a/IMG");


}

