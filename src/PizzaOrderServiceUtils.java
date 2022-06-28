import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;
public final class PizzaOrderServiceUtils {

    private static final Pattern INVALID_CHARACTER_PATTERN = Pattern.compile("[\"\'\\\\]");

    static final int ORDER_ID_LENGTH = 5;

    // do not instantiate
    private PizzaOrderServiceUtils() {}


    public static boolean isValidString(final String stringToValidate) {
        if (StringUtils.isBlank(stringToValidate)) {
            return false;
        }

        return !INVALID_CHARACTER_PATTERN.matcher(stringToValidate).find();
    }

    public static String generateOrderId() {
        return RandomStringUtils.randomAlphanumeric(ORDER_ID_LENGTH);
    }
}

