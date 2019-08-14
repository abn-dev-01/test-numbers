package test.numbers;

import java.util.Locale;
import java.util.Objects;
import java.util.ResourceBundle;

final public class ResourceUtil {

    public static final ResourceBundle MESSAGES = getResourceBundle();

    public static ResourceBundle getResourceBundle() {
        Locale locale = new Locale("en", "US");
        return ResourceBundle.getBundle("messages", locale);
    }

    public static String getMessageString(String label) {
        Objects.requireNonNull(label);
        return MESSAGES.getString(label);
    }


}
