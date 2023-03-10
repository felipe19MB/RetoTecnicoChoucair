package co.com.choucair.automation.android.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InitialPage {
    public static final Target BTNREGISTER = Target.the("registet button")
            .locatedForAndroid(By.id("com.exito.appcompania:id/AppCompatButton_registrarse")).locatedForIOS(By.id(""));

    public static final Target BTNINGRESAR = Target.the("registet button")
            .locatedForAndroid(By.id("com.exito.appcompania:id/AppCompatButton_ingresar")).locatedForIOS(By.id(""));

}
