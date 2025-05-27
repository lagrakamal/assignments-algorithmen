import java.util.ArrayList;

public class Backtrack {

    static int backtrack(final ArrayList<Item> items, final int maxWeight) {
        return backtrackHelper(items, maxWeight, items.size() - 1);

    }

    private static int backtrackHelper(final ArrayList<Item> items, final int maxWeight, final int currentIndex) {

        if (currentIndex < 0 || maxWeight <= 0) {
            return 0;
        } else {
            Item currentItem = items.get(currentIndex);

            if (currentItem.getWeight() > maxWeight) {
                return backtrackHelper(items, maxWeight, currentIndex - 1);
            } else {
                return Math.max(
                        currentItem.getValue()
                                + backtrackHelper(items, maxWeight - currentItem.getWeight(), currentIndex - 1),
                        backtrackHelper(items, maxWeight, currentIndex - 1));
            }
        }
    }
}
