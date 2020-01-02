package linkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

/**
 * @author Alex Komanov
 */
public class LinkedListMain {

    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<Integer>();
        List<Integer> arrayList = new ArrayList<Integer>();

        System.out.println("Linked List time:");
        measureTime(linkedList);
        System.out.println("==================");
        System.out.println("Array List time:");
        measureTime(arrayList);

    }

    private static void measureTime(List<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++){
            list.add(0, i);

        }
        long end = System.currentTimeMillis();

        System.out.println("" + end + " - " + start + " == " + (end - start));
    }
}
