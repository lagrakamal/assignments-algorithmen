
public class BruteForce {

    private ATM machine;

    public BruteForce(final ATM machine) {
        this.machine = machine;
    }

    private String crack(final String current, final int len) {

        String found = null;
        final int bis = 9;
        if (machine.check(current)) {
            found = current;
        } else {
            for (int i = 0; i <= bis && current.length() <= len && found == null; i++) {
                found = crack(current + i, len);
            }
        }
        return found;
    }

    public String crack(final int len) {

        return crack("", len);
    }

}
