package sortingList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AscendingOrder {
    public static void main(String[] args) {
        String[] array = {"blue", "red", "yellow", "green", "black"};

        var list = Arrays.asList(array);
        System.out.println("Unsorted list: " + list);

        Collections.sort(list);

        System.out.println("Sorted list: " + list);

    }
}
