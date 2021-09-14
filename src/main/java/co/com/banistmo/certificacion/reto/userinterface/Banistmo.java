package co.com.banistmo.certificacion.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;

@DefaultUrl("https://www.grupobancolombia.com/personas")

public class Banistmo extends PageObject {

    public static final Target QUITAR_OPCION= Target.the("Click en la X")
            .locatedBy("//*[@id='modal-prehome-fenix']/div/div/div[1]/button/img");

    public static final Target EMPRESAS =Target.the("Click en la opcion empresas")
            .located(By.id("header-empresas"));

    public static final Target CAPITAL_INTELIGENTE= Target.the("Click en la opcion capital inteligente")
            .locatedBy("//*[@id='menu-sup']/li[5]/a[contains(text(), 'Capital Inteligente')]");



    //*[@id="modal-prehome-fenix"]/div/div/div[1]/button/img

}


