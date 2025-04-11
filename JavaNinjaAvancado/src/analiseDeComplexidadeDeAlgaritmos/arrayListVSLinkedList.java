package analiseDeComplexidadeDeAlgaritmos;

import java.util.ArrayList;
import java.util.LinkedList;

public class arrayListVSLinkedList {
    public static void main(String[] args) {
        long start;
        long end;
        long time;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        int amount = 1_000_000; // change the amount value to see the difference between them

        for (int i = 0; i < amount; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        //  VERIFYING TIME CONSUMPTION ON GET()
        System.out.println("---------- GET METHOD ----------");

        // ARRAY LIST
        start = System.nanoTime();
        arrayList.get(500_000);
        end = System.nanoTime();
        time = end - start;
        System.out.println("array list time: " + time + "ns");

        // LINKED LIST
        start = System.nanoTime();
        linkedList.get(500_000);
        end = System.nanoTime();
        time = end - start;
        System.out.println("linked list time: " + time + "ns");
        // LinkedList is truly slow when it comes to get data from it


        //  VERIFYING TIME CONSUMPTION ON ADD()
        System.out.println("---------- ADD METHOD ----------");

        // ARRAY LIST
        start = System.nanoTime();
        arrayList.add(500_000);
        end = System.nanoTime();
        time = end - start;
        System.out.println("array list time: " + time + "ns");
        // the more items the arrayList have, the slower it will be to add new items in it

        // LINKED LIST
        start = System.nanoTime();
        linkedList.add(500_000);
        end = System.nanoTime();
        time = end - start;
        System.out.println("linked list time: " + time + "ns");
        // The more items the linkedList have, the faster it will be to add new items in it


        //  VERIFYING TIME CONSUMPTION ON REMOVE()
        System.out.println("---------- REMOVE METHOD ----------");

        // ARRAY LIST
        start = System.nanoTime();
        arrayList.remove(500_000);
        end = System.nanoTime();
        time = end - start;
        System.out.println("array list time: " + time + "ns");
        // the more items the arrayList have, the slower it will be to add new items in it

        // LINKED LIST
        start = System.nanoTime();
        linkedList.add(500_000);
        end = System.nanoTime();
        time = end - start;
        System.out.println("linked list time: " + time + "ns");
        // The more items the linkedList have, the faster it will be to add new items in it

        // BIG O NOTIATION

        // O ArrayList tem uma classificação do Big O notiation.
        // Sendo assim, o ArrayList é um O(n), ou seja Linear
        // Vai mudar cada posição dos elementos

        // O LinkedList tem uma complexidade constante de O(1)
        // Só muda o ponteiro, um movimento
    }
}
