
public class Arrays {

    static boolean binarySearchRec(final int[] array, final int search) {
        return binarySearchHelper(search, array, 0, array.length - 1);
    }

    public static boolean binarySearchHelper(final int search, final int[] array, final int start, final int end) {
        boolean found = false;

        while (start <= end && !found) {
            int mid = start + (end - start) / 2;
            int midValue = array[mid];
            if (search < midValue) {
                return binarySearchHelper(search, array, start, mid - 1);
            } else if (search > midValue) {
                return binarySearchHelper(search, array, mid + 1, end);
            } else {
                found = true;
            }
        }
        return found;
    }

    static int sum(final int[] array) {
        return sum(array, 0, array.length - 1);
    }

    static int sum(final int[] array, final int start, final int end) {

        if (start == end) {
            return array[start];
        } else if (start < end) {
            int mid = start + (end - start) / 2;
            int lsum = sum(array, start, mid - 1);
            int rsum = sum(array, mid + 1, end);
            return lsum + rsum + array[mid];

        }
        return 0;

    }

    static Integer magic(final int[] array) {

        return magic(array, 0, array.length - 1);
    }

    static Integer magic(final int[] array, final int start, final int end) {

        if (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = array[mid];
            if (mid < midValue) {
                return magic(array, start, mid - 1);
            } else if (mid > midValue) {
                return magic(array, mid + 1, end);
            } else {
                return mid;
            }
        } else {
            return null;
        }
    }

}
