package co.com.choucair.automation.android.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target EMAIL = Target.the("email user")
            .locatedForAndroid(By.id("com.exito.appcompania:id/TextInputEditText_email")).locatedForIOS(By.id(""));

    public static final Target PASSWORD = Target.the("password user")
            .locatedForAndroid(By.xpath("//android.widget.LinearLayout[@resource-id='com.exito.appcompania:id/CustomEditText_password']//android.widget.EditText")).locatedForIOS(By.id(""));

    public static final Target BTNINGRESAR = Target.the("ingresar")
            .locatedForAndroid(By.id("com.exito.appcompania:id/AppCompatButton_ingresar")).locatedForIOS(By.id(""));


}
