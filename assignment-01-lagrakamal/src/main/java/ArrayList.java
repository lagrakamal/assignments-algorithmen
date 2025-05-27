public class ArrayList<T> {

    private Object[] arraylist;
    private int size = 0;
    private final int m = 10;

    public ArrayList(int initKapa) {
        this.arraylist = new Object[initKapa];
    }

    public ArrayList() {
        this.arraylist = new Object[m];
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;

    }

    @SuppressWarnings("unchecked")
    public T get(int i) {
        return (T) this.arraylist[i];
    }

    public void add(int i, T value) {

        if (this.arraylist.length == size) {
            this.arraylist = Arrays.expandArray(arraylist);
        }
        if (i != this.arraylist.length) {
            Arrays.shiftElements(arraylist, i);
        }
        this.arraylist[i] = value;
        size++;

    }

}