package day39_collections;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();  // Array based class ===> get() is faster

        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.remove(0);


        arrayList.get(0);

        LinkedList<Integer> linkedList = new LinkedList<>(); // Node based class(Doubly linked list),
        // node means it has pointer to the next and previous ===> add(), addAll(), remove(), removeAll(), removeIf(),retainAll() are faster in linked list


        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

        linkedList.remove(0);


        linkedList.get(0);

        System.out.println("_________________________________________________");

        Vector<Integer> vector= new Vector<>();

        vector.add(100);
        vector.add(200);
        vector.add(300);

        vector.get(0);

        Stack<Integer> stack = new Stack<>();

        stack.add(100);
        stack.add(200);
        stack.add(300);
        int lastElement = stack.pop();
        System.out.println(lastElement);
        System.out.println(stack);




    }
}
