import java.util.List;
import java.util.ArrayList;

public class Strings {

    public static List<String> substrings(final String str) {
        List<String> res = new ArrayList<>();
        substrings(str, 0, "", res);
        return res;
    }

    static void substrings(final String str, final int i, final String current, final List<String> result) {
        if (str.length() <= i) {
            result.add(current);
        } else {
            substrings(str, i + 1, current + str.charAt(i), result);
            substrings(str, i + 1, current, result);
        }
        result.add(current);

    }

}