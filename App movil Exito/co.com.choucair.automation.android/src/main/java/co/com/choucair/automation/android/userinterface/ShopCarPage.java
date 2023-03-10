package co.com.choucair.automation.android.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShopCarPage {

    public static final Target TITLEPRODUCTCAR = Target.the("title product car")
            .locatedForAndroid(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[4]/android.view.View[2]/android.view.View[1]")).locatedForIOS(By.id(""));

}
