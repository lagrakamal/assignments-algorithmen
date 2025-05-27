public class Arrays {

    public static Object[] expandArray(Object[] a) {

        Object[] arr = new Object[a.length * 2];
        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i];

        }
        return arr;
    }

    public static void shiftElements(Object[] a, int i) {

        for (int j = a.length - 2; j >= i; j--) {
            a[j + 1] = a[j];
        }

    }

}