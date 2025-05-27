
public class Driver {

    public static void main(final String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add(0, "a");
        list.add(1, "b");
        list.add(2, "c");

        System.out.println(list.contains(new String("a")));
        System.out.println(list.contains(new String("b")));
        System.out.println(list.contains(null));

    }

}
