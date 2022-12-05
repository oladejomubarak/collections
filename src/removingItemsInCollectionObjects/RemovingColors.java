package removingItemsInCollectionObjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class RemovingColors {
    private static void removeColors(Collection<String> collection1, Collection<String> collection2){
        Iterator<String> iterator = collection1.iterator();
     while (iterator.hasNext()){

         if(collection2.contains(iterator.next())) {
             iterator.remove();
         }
        }

    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};


        for(String color : colors){
            list.add(color);
        }
        List<String> removeList = new ArrayList<>();
        String[] removeColors =  {"RED", "WHITE", "BLUE"};

        for(String color : removeColors){
            removeList.add(color);
        }

        System.out.println("original list element: ");

        for(int count=0; count < list.size(); count++ ){
            System.out.print(list.get(count) + " ");
        }
        System.out.println();

        removeColors(list, removeList);

        System.out.println("list element after removing contained elements: ");

        for(String i : list){
            System.out.print(i + " ");

        }
    }
}
