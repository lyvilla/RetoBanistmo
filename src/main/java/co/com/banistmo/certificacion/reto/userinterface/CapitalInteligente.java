package co.com.banistmo.certificacion.reto.userinterface;

import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CapitalInteligente {

    public static final IFrame I_FRAME = IFrame.withPath(By.xpath("/html/body/iframe[1]"));


    public static final Target ACTUALIDAD_ECONOMICA= Target.the("Click en la opcion actualidad economica")
            .inIFrame(I_FRAME).locatedBy("//*[@id='bs-example-navbar-collapse-1']/ul/li[2]/a]");

    public static final Target OPEP= Target.the("Click en la opcion actualidad economica")
            .locatedBy("//div[@id='capital_inteligente']/div[1]/div[18]/div[2]/h2/a");


}

