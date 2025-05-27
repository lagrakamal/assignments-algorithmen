
public class SLList<T> implements List<T> {

    private Node<T> head;
    private int size = 0;

    public SLList() {
        this.head = null;
    }

    public boolean isEmpty() {

        return this.head == null;
    }

    public Node<T> nodeAt(final int index) {

        Node<T> current = this.head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current;
    }

    public T get(final int index) {
        if (index >= this.size || index < 0) {
            throw new IndexOutOfBoundsException("Invalid Index : " + index);
        }
        return nodeAt(index).value;

    }

    public int size() {
        return this.size;
    }

    public void add(final int index, final T e) {
        if (index > this.size) {
            throw new IndexOutOfBoundsException("Invalid Index : " + index);
        }
        if (index == 0) {
            this.head = new Node<T>(e, this.head);
        } else {
            Node<T> prev = nodeAt(index - 1);
            prev.next = new Node<T>(e, prev.next);
        }
        this.size++;

    }

    public T remove(final int index) {

        Node<T> removedvalue;
        if (index == 0) {
            removedvalue = this.head;
            this.head = this.head.next;
        } else {

            Node<T> prev = nodeAt(index - 1);
            removedvalue = prev.next;
            prev.next = removedvalue.next;
        }

        this.size--;
        return removedvalue.value;
    }

    @Override
    public boolean contains(final T value) {

        return containsHelper(value, this.head);
    }

    private boolean containsHelper(final T value, final Node<T> currnode) {

        if (currnode == null) {
            return false;
        } else if (compare(currnode.value, value)) {
            return true;
        } else {
            return containsHelper(value, currnode.next);

        }
    }

    private static <T> boolean compare(final T value1, final T value2) {

        if (value1 == null || value2 == null) {
            if (value1 == value2) {
                return true;
            }
        } else if (value1.equals(value2)) {
            return true;
        }
        return false;

    }

}
