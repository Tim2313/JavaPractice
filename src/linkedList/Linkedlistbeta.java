package linkedList;

import java.sql.SQLOutput;

public class Linkedlistbeta {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.addLast("A");
        linkedList.addLast("B");
        linkedList.addLast("C");
        linkedList.addLast("D");
        linkedList.addLast("E");

        System.out.println("LL " + linkedList);
        linkedList.addFirst("Z");
        System.out.println("LL " + linkedList);

        System.out.println("Index of element with value 'E': " + linkedList.get("E"));
        System.out.println("Index of element with value 'EE': " + linkedList.get("EE"));

        linkedList.remove("B");
        linkedList.remove("Z");

        System.out.println("LL " + linkedList);

    }



}
