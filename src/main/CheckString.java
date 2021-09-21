package main;

import java.util.regex.Pattern;

public class CheckString {
    public static boolean isIpAdress(String ex){
        return Pattern.matches("^((\\d{1,2}|1\\d{0,2}|2\\d?|2[0-4]\\d{1}|25[0-5]{1})\\.){3}((\\d{1,2}|1\\d{0,2}|2\\d{0,1}|2[0-4]\\d{1}|25[0-5]{1}))$",ex);
    }
    public static boolean isGUID(String ex){
        return Pattern.matches("^(?:[0-9a-fA-F]{8}-(?:[0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12})$|^\\{(?:[0-9a-fA-F]{8}-(?:[0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12})}$",ex);
    }
    public static boolean isURL(String ex){
        return Pattern.matches("(?!.*([\\.=\\?\\&])\\1)^(http[s]?:\\/\\/)?(?!.*(_))(?!.*(\\.)\\1)\\w{1}[\\w\\.-]+\\.[\\w]*\\w{1}(\\/[\\w\\/\\-\\&\\?\\=]*(\\:[\\d]+)?#?[\\w\\.\\-]*)?$",ex);
    }
    public static boolean isStrongPassword(String ex){
        return Pattern.matches("(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])[\\w-]{8,}",ex);
    }
}
