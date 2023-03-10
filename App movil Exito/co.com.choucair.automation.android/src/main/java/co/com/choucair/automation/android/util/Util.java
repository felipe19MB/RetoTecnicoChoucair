package co.com.choucair.automation.android.util;

public class Util {
    public static final String CONFIRMATION_PAGE = "Código de confirmación";
    public static final String CART_MESSAGE = "Su carrito está vacio";

    public static void waitProccess(int milisegundos){
        try {
            Thread.sleep(milisegundos);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
