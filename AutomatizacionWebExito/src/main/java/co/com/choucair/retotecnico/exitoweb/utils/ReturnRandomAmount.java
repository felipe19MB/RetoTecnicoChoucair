package co.com.choucair.retotecnico.exitoweb.utils;

import java.util.Random;

public class ReturnRandomAmount {
    public static int getRandomIntInARange(int min, int max) {
        Random random = new Random();
        return random.ints(min, max).findFirst().orElse(1);
    }
}
