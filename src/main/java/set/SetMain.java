package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Alex Komanov
 */
public class SetMain {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        Set<String> treeSet = new TreeSet<String>();

        System.out.println("----------hashSet--------------");
        hashSet.add("Alex");
        hashSet.add("Al");
        hashSet.add("A");
        hashSet.add("Ale");
        hashSet.add("Sasha");
        hashSet.add("Sasha");
        for (String name : hashSet) {
            System.out.println(name);
        }

        System.out.println("----------linkedHashSet--------------");
        linkedHashSet.add("Alex");
        linkedHashSet.add("Al");
        linkedHashSet.add("A");
        linkedHashSet.add("Ale");
        linkedHashSet.add("Sasha");
        for (String name : linkedHashSet) {
            System.out.println(name);
        }

        System.out.println("----------treeSet--------------");
        treeSet.add("Al");
        treeSet.add("A");
        treeSet.add("Ale");
        treeSet.add("Sasha");
        treeSet.add("Alex");
        for (String name : treeSet) {
            System.out.println(name);
        }

        System.out.println("------Methods-------");
        System.out.println(hashSet.contains("Alex"));
        System.out.println(treeSet.contains("Alex"));
        System.out.println(treeSet.contains("Alexa"));
        System.out.println(treeSet.isEmpty());


    }
}
