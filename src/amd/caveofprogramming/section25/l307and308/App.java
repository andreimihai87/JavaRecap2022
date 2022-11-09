package amd.caveofprogramming.section25.l307and308;

/*
 * Create a generic class that can store objects of any type.
 * 
 * The class should use an internal array to store the objects.
 * The size of the internal array should be specified by the constructor.
 * 
 * The class should have add(), get() and size() methods.
 * 
 * The add() method accepts an object to add, and may be called
 * as many times as is desired.
 * 
 * The get() method accepts an index and returns the item at the given
 * index in the array.
 * 
 * The size() method returns the number of items presently in the internal array.
 * 
 * If more items are added than can be fitted in the array,
 * the class starts overwriting items at the start of the array.
 * 
 * Example:
 * 
 * Internal buffer of size 3.
 * 
 * First three items are stored at indexes 0-2.
 * 
 * Fourth item overwrites item at index 0
 * Fifth item overwrites item at index 1
 * etc.
 * 
 * 
 */

public class App {

    public static void main(String[] args) {

        Person p1 = new Person("Alex");
        Person p2 = new Person("Andrei");
        Person p3 = new Person("Mihai");
        Person p4 = new Person("Pavel");
        Person p5 = new Person("Petru");
        
        RingBuffer<Person> personRingBuffer = new RingBuffer<>(3);
        
        personRingBuffer.add(p1);
        personRingBuffer.add(p2);
        personRingBuffer.add(p3);
        
        System.out.println(personRingBuffer.get(0));
        System.out.println(personRingBuffer.get(1));
        System.out.println(personRingBuffer.get(2));
        
        
        personRingBuffer.add(p4);
        personRingBuffer.add(p5);
        
        System.out.println();
        System.out.println(personRingBuffer.get(0));
        System.out.println(personRingBuffer.get(1));
        System.out.println(personRingBuffer.get(2));
        
        System.out.println(personRingBuffer.size());
        
    }

}
