package java21features;

import java.util.ArrayList;
import java.util.SequencedCollection;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SequencedCollectionExample {

    public static void main(String[] args) {
        
        // Sequenced Collection with ArrayList
        // Sequenced Collection is a new interface in Java 21 which extends Collection interface and provides methods to add elements at the beginning and end of the collection.
        SequencedCollection<String> arrayList = new ArrayList<>();

        arrayList.add("One");
        arrayList.add("Two");
        System.out.println("First element: " + arrayList.getFirst());
        System.out.println("Sequenced Collection: " + arrayList);
        arrayList.addFirst("Zero");
        System.out.println("First element: " + arrayList.getFirst());
        System.out.println("Sequenced Collection after adding first element: " + arrayList);
        arrayList.addLast("Three");
        System.out.println("Sequenced Collection after adding last element: " + arrayList);

        

        // Sequenced Collection with LinkedList
        SequencedCollection<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        System.out.println("Sequenced Collection: " + linkedList);
        linkedList.addFirst(0);
        System.out.println("Sequenced Collection after adding first element: " + linkedList);
        linkedList.addLast(3);
        System.out.println("Sequenced Collection after adding last element: " + linkedList);

        // Sequenced Collection with ArrayDeque
        SequencedCollection<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("One");
        arrayDeque.add("Two");
        System.out.println("Sequenced Collection: " + arrayDeque);
        arrayDeque.addFirst("Zero");
        System.out.println("Sequenced Collection after adding first element: " + arrayDeque);
        arrayDeque.addLast("Three");
        System.out.println("Sequenced Collection after adding last element: " + arrayDeque);

        // Sequenced Collection with LinkedHashSet
        SequencedCollection<Integer> linkedHasSet = new LinkedHashSet<>(); 
        linkedHasSet.add(1);
        linkedHasSet.add(2);
        System.out.println("Sequenced Collection: " + linkedHasSet);
        linkedHasSet.addFirst(0);
        System.out.println("Sequenced Collection after adding first element: " + linkedHasSet);
        linkedHasSet.addLast(3);
        System.out.println("Sequenced Collection after adding last element: " + linkedHasSet);

        // Sequenced Collection with TreeSet
        SequencedCollection<String> treeSet = new TreeSet<>();
        treeSet.add("One");
        treeSet.add("Two");
        System.out.println("Sequenced Collection: " + treeSet);
        treeSet.addFirst("Zero"); // This will throw UnsupportedOperationException as TreeSet does not support addFirst method
        

    }
}
