package sortingList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortingListInDescendingOrder {
    public static void main(String[] args) {
        String[] array = {"blue", "red", "yellow", "green", "black"};

        var list = Arrays.asList(array);
        System.out.println("Unsorted list: " + list);

        //Collections.sort(list, Collections.reverseOrder());
        list.sort(Collections.reverseOrder());

        System.out.println("Sorted list: " + list);

    }
}
