package usingToArray;

import java.util.Arrays;
import java.util.LinkedList;

public class UsingToArray {
    public static void main(String[] args) {
        String[] colors = {"red", "yellow", "green"};
        LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));

        links.add("white");
        links.addFirst("black");
        links.addLast("orange");
        links.add(3, "purple");

        colors = links.toArray(new String[links.size()]);

        for (String color : colors){
            System.out.println(color);
        }


    }
}
