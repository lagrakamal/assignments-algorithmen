public interface List<T> {

    boolean isEmpty();

    void add(int index, T e);

    T get(int index);

    int size();

    T remove(int index);
}
