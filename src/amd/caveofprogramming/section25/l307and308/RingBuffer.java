package amd.caveofprogramming.section25.l307and308;

import java.util.ArrayList;

/**
 * RingBuffer using ArrayList
 *
 * @param <E>
 */
public class RingBuffer<E> {

    private int size;
    private ArrayList<E> objList;
    private int numberOfObjectsAdded;

    public RingBuffer(int size) {
        this.size = size;
        objList = new ArrayList<E>(size);
    }

    public void add(E obj) {
        int position = size();

        if (position < size) {
            objList.add(obj);
        }
        else {
            objList.set(numberOfObjectsAdded % size, obj);
        }
        numberOfObjectsAdded++;
    }

    public E get(int index) {
        return objList.get(index);
    }

    public int size() {
        return objList.size();
    }

}
