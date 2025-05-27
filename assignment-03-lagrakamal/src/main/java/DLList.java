
public class DLList<T> {

    private DLNode<T> head;
    private DLNode<T> last;
    private int size = 0;

    public DLList() {
        this.head = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public void add(int index, T e) {
        DLNode<T> current = new DLNode<T>(e, null, null);
        if (index == 0 && this.size == 0) {
            this.head = current;
            this.last = current;
        } else if (index == 0 && this.size > 0) {
            current.next = this.head;
            this.head.prev = current;
            this.head = current;
        } else if (index > 0 && index == this.size) {
            current.prev = this.last;
            this.last.next = current;
            this.last = current;
        } else {
            DLNode<T> pred = nodeAt(index - 1);
            current.prev = pred;
            current.next = pred.next;
            pred.next = current;
        }

        this.size++;
    }

    private DLNode<T> nodeAt(int index) {

        if (index > (this.size) / 2) {
            DLNode<T> curEnd = this.last;
            for (int i = this.size - 1; i < index; i--) {
                curEnd = curEnd.prev;
            }
            return curEnd;
        } else {
            DLNode<T> curStart = this.head;
            for (int i = 0; i < index; i++) {
                curStart = curStart.next;
            }
            return curStart;
        }
    }

    public T get(int index) {
        return nodeAt(index).value;
    }
}
