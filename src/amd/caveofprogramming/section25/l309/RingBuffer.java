package amd.caveofprogramming.section25.l309;

import java.util.Iterator;

/**
 * RingBuffer with Array
 */
public class RingBuffer<E> implements Iterable<E> {

    private E[] array;
    private int writePosition;
    private int numberOfObjectsAdded;

    private class RingIterator implements Iterator<E> {

        private int readPosition = 0;

        @Override
        public boolean hasNext() {
            return readPosition < numberOfObjectsAdded;
        }

        @Override
        public E next() {
            return array[readPosition++];
        }

    }

    @SuppressWarnings("unchecked")
    public RingBuffer(int size) {
        array = (E[]) new Object[size];
    }

    public void add(E obj) {
        array[writePosition++] = obj;

        if (writePosition == array.length) {
            writePosition = 0;
        }
        if (++numberOfObjectsAdded > array.length) {
            numberOfObjectsAdded = array.length;
        }
    }

    public Object get(int index) {
        return array[index];
    }

    public int size() {
        return numberOfObjectsAdded;
    }

    @Override
    public Iterator<E> iterator() {
        return new RingIterator();
    }

}
