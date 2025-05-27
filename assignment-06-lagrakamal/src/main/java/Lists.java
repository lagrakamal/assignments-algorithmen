public class Lists<T> {

    public static <T> boolean contains(final List<T> list, final T value) {

        boolean found = false;

        for (int i = 0; i < list.size() && !found; i++) {
            T ivalue = list.get(i);
            if (ivalue == null && list.contains(value)) {
                found = true;

            } else if (ivalue != null && list.get(i).equals(value)) {
                found = true;

            }
        }

        return found;
    }
}
