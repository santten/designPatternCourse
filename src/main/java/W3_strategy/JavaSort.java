package W3_strategy;

import java.util.Arrays;

public class JavaSort implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        Arrays.sort(array);
    }

    @Override
    public String getName() {
        return "JavaSort";
    }
}
