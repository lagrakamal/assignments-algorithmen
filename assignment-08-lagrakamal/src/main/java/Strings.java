
public class Strings {
    public static final int ASCII = 128;

    public static boolean containsDuplicates(final String string) {
        boolean found = false;
        char[] inp = string.toCharArray();

        for (int i = 0; i < string.length() && !found; i++) {
            for (int j = i + 1; j < string.length() && !found; j++) {
                if (inp[i] == inp[j]) {
                    found = true;
                }
            }
        }
        return found;
    }

    public static boolean containsDuplicatesOptimized(final String string) {
        boolean[] arr = new boolean[ASCII];
        boolean duplifound = false;
        for (int i = 0; i < string.length() && !duplifound; i++) {
            char character = string.charAt(i);
            int ascii = (int) character;
            if (arr[ascii]) {
                duplifound = true;
            } else {
                arr[ascii] = true;
            }
        }
        return duplifound;
    }

    public static String lcsDyn(final String s1, final String s2) {
        String[][] strings = new String[s1.length() + 1][s2.length() + 1];
        return lcsDyn(strings, 0, s1, 0, s2);
    }

    private static String lcsDyn(final String[][] strings, final int i1, final String s1, final int i2,
            final String s2) {
        if (i1 >= s1.length() || i2 >= s2.length()) {
            return "";
        } else {
            if (strings[i1][i2] != null) {
                return strings[i1][i2];
            }
            char char1 = s1.charAt(i1);
            char char2 = s2.charAt(i2);
            if (char1 == char2) {
                strings[i1][i2] = char1 + lcsDyn(strings, i1 + 1, s1, i2 + 1, s2);
            } else {
                String withoutfirst = lcsDyn(strings, i1 + 1, s1, i2, s2);
                String withoutsecond = lcsDyn(strings, i1, s1, i2 + 1, s2);

                if (withoutfirst.length() > withoutsecond.length()) {
                    strings[i1][i2] = withoutfirst;
                } else {
                    strings[i1][i2] = withoutsecond;
                }
            }
            return strings[i1][i2];
        }

    }

}
