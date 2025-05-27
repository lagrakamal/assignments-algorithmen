
import java.util.NoSuchElementException;

public class Stack<T> {

    private Node<T> head;

    public Stack() {

        this.head = null;
    }

    public boolean isEmpty() {

        return this.head == null;
    }

    // Packt das Element e auf den Stapel.
    public void push(T e) {

        this.head = new Node<T>(e, this.head);
    }

    // Nimmt das oberste Element vom Stapel und liefert es zur�ck(+ entfernen).
    public T pop() {
        if (this.head == null) {
            // This exception is thrown to indicate that there are no more elements in an
            // enumeration.
            throw new NoSuchElementException("nicht m�glich, Stack ist Emptyt!");
        } else {

            T value = this.head.value;
            this.head = this.head.next;
            return value;
        }

    }

    // Gibt das oberste Element vom Stapel zur�ck, ohne es zu entfernen.
    public T peek() {
        if (this.head == null) {
            throw new RuntimeException(" !! Stack is EMPTY !! ");
        }
        return this.head.value;
    }

    // Liefert genau dann true, wenn sich der Wert im Stack befindet. Ansonsten wird
    // false zur�ckgegeben.
    public boolean find(T e) {
        boolean found = false;
        Node<T> current = this.head;
        while (current != null && !found) {
            if (current.value.equals(e)) {
                found = true;
            }
            // if(found)break;
            current = current.next;

        }
        return found;
    }

}
