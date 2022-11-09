package amd.caveofprogramming.section25.l307and308;

/**
 * RingBuffer using array
 *
 * @param <E>
 */
public class RingBuffer2<E> {

    private E[] array;
    private int size;
    private int numberOfObjectsAdded;

    @SuppressWarnings("unchecked")
    public RingBuffer2(int size) {
        array = (E[]) new Object[size];
        this.size = size;
    }

    public void add(E obj) {
        int position = size();

        if (position < size) {
            array[position] = obj;
        }
        else {
            array[numberOfObjectsAdded % size] = obj;
        }
        numberOfObjectsAdded++;
    }

    public Object get(int index) {
        return array[index];
    }

    public int size() {
        int objectsInArray = 0;
        for (Object obj : array) {
            if (obj != null) {
                objectsInArray++;
            }
        }
        return objectsInArray;
    }

}
