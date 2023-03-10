package co.com.choucair.automation.android.interactions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import static co.com.choucair.automation.android.util.Util.waitProccess;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class Coordinates implements Interaction {
    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Coordinates guideCoordinates(int x, int y){
        return Tasks.instrumented(Coordinates.class, x, y);    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        AndroidDriver android = getProxiedDriver();
        TouchAction touchAction = new TouchAction(android);
        waitProccess(100);
        touchAction.press(PointOption.point(x, y)).release().perform();
        waitProccess(100);
    }
}
