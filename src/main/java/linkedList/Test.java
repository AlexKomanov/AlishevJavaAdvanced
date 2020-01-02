package linkedList;

/**
 * @author Alex Komanov
 */
public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(25);
        myLinkedList.add(3);
        myLinkedList.add(16);
        myLinkedList.add(56);
        myLinkedList.add(19);

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(3));
        System.out.println(myLinkedList.get(4));

        myLinkedList.remove(0);
        System.out.println(myLinkedList);
    }
}
