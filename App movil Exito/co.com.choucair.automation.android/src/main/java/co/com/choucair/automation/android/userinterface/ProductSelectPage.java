package co.com.choucair.automation.android.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductSelectPage {

    public static final Target SEARCHER = Target.the("prodcut searcher")
            .locatedForAndroid(By.id("com.exito.appcompania:id/appCompatEditText_search_bar")).locatedForIOS(By.id(""));
    public static final Target NOTIFICATION = Target.the("Notification")
            .locatedForAndroid(By.id("com.android.permissioncontroller:id/permission_deny_button")).locatedForIOS(By.id(""));

    public static final Target COMERCIAL = Target.the("comercial")
            .locatedForAndroid(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")).locatedForIOS(By.id(""));

    public static final Target BTNSEARCHER = Target.the(" btnprodcut searcher")
            .locatedForAndroid(By.id("com.exito.appcompania:id/text_input_start_icon")).locatedForIOS(By.id(""));

    public static final Target DELIVERY = Target.the("delivery prodcut")
            .locatedForAndroid(By.id("com.exito.appcompania:id/appCompatTextView_home_delivery_description")).locatedForIOS(By.id(""));

    public static final Target ADDPRODUCT = Target.the("add prodcut ")
            .locatedForAndroid(By.xpath("(//androidx.recyclerview.widget.RecyclerView//android.widget.FrameLayout[@resource-id='com.exito.appcompania:id/cardView_main']//android.view.ViewGroup[@resource-id='com.exito.appcompania:id/constraitLayout_add_item'])[1]")).locatedForIOS(By.id(""));

    public static final Target TITTLEPRDUCT = Target.the("tittle prodcut ")
            .locatedForAndroid(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[5]")).locatedForIOS(By.id(""));

    public static final Target SHOPCAR = Target.the("shop car")
            .locatedForAndroid(By.id("com.exito.appcompania:id/appCompatImageView_shopping_cart")).locatedForIOS(By.id(""));

    public static final Target BTNCONTINUE = Target.the("btn continue")
            .locatedForAndroid(By.id("com.exito.appcompania:id/appCompatButton_continue")).locatedForIOS(By.id(""));

    public static final Target SEARCHERII = Target.the("prodcut searcher")
            .locatedForAndroid(By.id("com.exito.appcompania:id/appCompatEditText_search_data_edit")).locatedForIOS(By.id(""));



}
