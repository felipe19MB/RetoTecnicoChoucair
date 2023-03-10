package co.com.choucair.automation.android.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPage {

    public static final Target NOMBRES = Target.the("nombres usuario")
            .locatedForAndroid(By.xpath("//android.widget.LinearLayout[@resource-id='com.exito.appcompania:id/CustomEditText_nombres']//android.widget.EditText")).locatedForIOS(By.id(""));

    public static final Target APELLIDOS = Target.the("nombres usuario")
            .locatedForAndroid(By.xpath("//android.widget.LinearLayout[@resource-id='com.exito.appcompania:id/CustomEditText_apellidos']//android.widget.EditText")).locatedForIOS(By.id(""));

    public static final Target TIPODOCUMENTO = Target.the("tipo documento")
            .locatedForAndroid(By.id("com.exito.appcompania:id/filled_exposed_dropdown")).locatedForIOS(By.id(""));

    public static final Target DOCUEMENTO = Target.the("numero documento")
            .locatedForAndroid(By.xpath("//android.widget.LinearLayout[@resource-id='com.exito.appcompania:id/CustomEditText_numero_doc']//android.widget.EditText")).locatedForIOS(By.id(""));

    public static final Target ANIONACIMIENTO = Target.the("año nacimiento")
            .locatedForAndroid(By.id("com.exito.appcompania:id/filled_exposed_dropdown_anio_registro")).locatedForIOS(By.id(""));

    public static final Target MESNACIMIENTO = Target.the("mes nacimiento")
            .locatedForAndroid(By.id("com.exito.appcompania:id/filled_exposed_dropdown_mes_registro")).locatedForIOS(By.id(""));

    public static final Target DIANACIMIENTO = Target.the("mes nacimiento")
            .locatedForAndroid(By.id("com.exito.appcompania:id/filled_exposed_dropdown_dia_registro")).locatedForIOS(By.id(""));

    public static final Target CELULAR = Target.the("mes nacimiento")
            .locatedForAndroid(By.id("com.exito.appcompania:id/TextInputEditText_tel")).locatedForIOS(By.id(""));

    public static final Target EMAIL = Target.the("mes nacimiento")
            .locatedForAndroid(By.xpath("//android.widget.LinearLayout[@resource-id='com.exito.appcompania:id/CustomEditText_email_register']//android.widget.EditText")).locatedForIOS(By.id(""));

    public static final Target TERMINOSCONDICIONES = Target.the("mes nacimiento")
            .locatedForAndroid(By.className("android.widget.CheckBox")).locatedForIOS(By.id(""));


    public static final Target POLITICAS = Target.the("mes nacimiento")
            .locatedForAndroid(By.className("com.exito.appcompania:id/AppCompatTextView_politicas_tratamiento")).locatedForIOS(By.id(""));
    public static final Target BTNCONFIRMAR = Target.the("mes nacimiento")
            .locatedForAndroid(By.id("com.exito.appcompania:id/AppCompatButton_registrar")).locatedForIOS(By.id(""));
}
