public class ArrayList<T> implements List<T> {

    private Object[] arraylist;
    private int size = 0;
    private final int m = 10;

    public ArrayList(final int initKapa) {
        this.arraylist = new Object[initKapa];
    }

    public ArrayList() {
        this.arraylist = new Object[m];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public void add(final int index, final T e) {
        if (this.size == this.arraylist.length - 1) {
            this.arraylist = Arrays.expandArray(this.arraylist);
        }

        if (this.size != index) {
            Arrays.shiftElements(arraylist, index);
        }

        this.arraylist[index] = e;
        this.size++;

    }

    @SuppressWarnings("unchecked")
    @Override
    public T get(final int index) {
        return (T) this.arraylist[index];
    }

    @Override
    public T remove(final int index) {
        T removedvalue = get(index);
        if (index < 0 || index > this.size - 1) {
            throw new IndexOutOfBoundsException("Index Out of Bounds - Invalid Index : " + index);
        } else {
            for (int j = index; j < arraylist.length - 1; j++) {
                this.arraylist[j] = this.arraylist[j + 1];
            }
            this.size--;
        }
        return removedvalue;
    }

    @Override
    public boolean contains(final T value) {

        return containshm(this.arraylist, value);

    }

    private boolean containshm(final Object[] arr, final T value) {

        boolean found = false;
        for (int i = 0; i < size() && !found; i++) {
            T currvalue = get(i);
            if (currvalue == null && currvalue == value) {
                found = true;

            } else if (currvalue != null && currvalue.equals(value)) {

                found = true;

            }
        }
        return found;
    }

}
