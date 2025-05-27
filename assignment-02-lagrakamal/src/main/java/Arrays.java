public class Arrays {

    public static Object[] expandArray(Object[] a) {

        Object[] arr = new Object[a.length * 2];
        for (int i = 0; i < a.length - 1; i++) {

            arr[i] = a[i];

        }
        return arr;
    }

    public static void shiftElements(Object[] a, int index) {
        for (int j = a.length - 1; j > index; j--) {
            a[j] = a[j - 1];

        }

    }
}
