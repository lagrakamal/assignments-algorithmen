import java.util.ArrayList;

public class TestIndex {

    private final static int ARRAY_LENGTH = 5;

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(ARRAY_LENGTH);
        String[] buchstaben = new String[] { "a", "b", "c", "d", "e" };
        for (int i = 0; i < buchstaben.length; i++) {
            list.add(i, buchstaben[i]);
            System.out.print(list.get(i) + " ");
        }
    }

}