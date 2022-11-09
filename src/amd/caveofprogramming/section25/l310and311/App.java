package amd.caveofprogramming.section25.l310and311;

import java.util.Iterator;

/* 
 * Modify the iterator so that it starts reading from the item that was added the earliest,
 * and finishes reading at the item that was added last.
 * 
 * E.g.
 * 
 * given this declaration: Ring<Integer> ring = new Ring<3>();
 *
 * ring.add(1);
 * iterator returns : 1
 * 
 * ring.add(1);
 * ring.add(2);
 * iterator returns 1,2
 * 
 * ring.add(1);
 * ring.add(2);
 * ring.add(3);
 * iterator returns 1,2,3
 * 
 * ring.add(1);
 * ring.add(2);
 * ring.add(3);
 * ring.add(4);
 * iterator returns 2,3,4
 * 
 * ring.add(1);
 * ring.add(2);
 * ring.add(3);
 * ring.add(4);
 * ring.add(5);
 * iterator returns 3,4,5
 * 
 * etc.
 * 
 */

public class App {

    public static void main(String[] args) {

        RingBuffer<Integer> ringBuffer = new RingBuffer<>(3);

        ringBuffer.add(1);
        ringBuffer.add(2);
        ringBuffer.add(3);
        ringBuffer.add(4);
        ringBuffer.add(5);
        ringBuffer.add(6);
        ringBuffer.add(7);

        Iterator<Integer> ringIt = ringBuffer.iterator();
        while (ringIt.hasNext()) {
            System.out.println(ringIt.next());
        }

    }

}
