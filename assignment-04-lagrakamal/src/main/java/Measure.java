import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class Measure {

    static final int MAGIC_NUMBER = 100000;

    static <T> void measure(Supplier<T> supplier) {
        long startTime = System.nanoTime();
        supplier.get();
        long endTime = System.nanoTime();
        long difference = endTime - startTime;
        System.out.println(" Ausführung dauerte " + TimeUnit.NANOSECONDS.toMillis(difference) + "ms");
    }

    public static void main(String[] args) {

        ArrayList<Integer> arraylist = new ArrayList<>();
        SLList<Integer> sllist = new SLList<>();

//        String[] buchstaben = new String[] { "a", "b", "c", "d", "e" };
//        for (int i = 0; i < buchstaben.length; i++) {
//            arraylist.add(i, buchstaben[i]);
//            System.out.print(arraylist.get(i) + " ");
//        }
//        for (int i = 0; i < buchstaben.length; i++) {
//            sllist.add(i, buchstaben[i]);
//            System.out.print(sllist.get(i) + " ");
//        }
        for (int i = 0; i <= MAGIC_NUMBER; i++) {
            arraylist.add(i, i + 1);
            sllist.add(i, i + 1);
        }
        System.out.println();
        System.out.println("Objektmethode contains für SLList");
        measure(() -> sllist.contains(MAGIC_NUMBER));
        System.out.println(sllist.contains(MAGIC_NUMBER));
        System.out.println("Objektmethode contains für ArrayList");
        measure(() -> arraylist.contains(MAGIC_NUMBER));
        System.out.println("Statische Methode contains für SLList");
        measure(() -> Lists.contains(sllist, MAGIC_NUMBER));
        System.out.println("Statische Methode contains für ArrayList");
        measure(() -> Lists.contains(arraylist, MAGIC_NUMBER));
    }

}
