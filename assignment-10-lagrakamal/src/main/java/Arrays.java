
public class Arrays {

    static int[] fuse(final int[] source, final int start1, final int end1, final int start2, final int end2) {

        int[] res = new int[(end1 + end2) - (start1 + start2) + 2];
        int i = 0;
        int i1 = start1;
        int i2 = start2;
        while (i1 <= end1 && i2 <= end2) {
            res[i++] = source[i1] <= source[i2] ? source[i1++] : source[i2++];
        }
        while (i1 <= end1) {
            res[i++] = source[i1++];
        }
        while (i2 <= end2) {
            res[i++] = source[i2++];
        }
        return res;
    }

    static void copy(final int[] source, final int[] target, final int offset) {

        for (int i = offset, j = 0; i < target.length && j < source.length; i++, j++) {
            target[i] = source[j];

        }

    }

    static void sort(final int[] arr, final int start, final int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;

            sort(arr, start, mid);
            sort(arr, mid + 1, end);

            int[] res = fuse(arr, start, mid, mid + 1, end);

            copy(res, arr, start);

        }
    }

    static void sort(final int[] array) {

        sort(array, 0, array.length - 1);

    }
}
