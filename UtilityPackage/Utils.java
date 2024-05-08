package UtilityPackage;
import java.util.regex.*;

public class Utils {
    boolean alphabet, number;
    public boolean isPasswordValid(String password) {
        for (char charPass : password.toCharArray()) {
            if (charPass <= 90 && charPass >= 64) alphabet = true;
            if (charPass <= 57 && charPass >= 48) number = true;
        }
        if (alphabet && number) return true;
        else return false;
    }
    public static boolean isEmailValid(String email){
        String regex = "^(.+)@(.+).(.+)$";
        return Pattern.compile(regex).matcher(email).matches();
    }
}

