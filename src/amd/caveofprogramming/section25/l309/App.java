package amd.caveofprogramming.section25.l309;

import java.util.Iterator;

public class App {

    public static void main(String[] args) {

        RingBuffer<Integer> ringBuffer = new RingBuffer<>(3);

        ringBuffer.add(1);
        ringBuffer.add(2);
        ringBuffer.add(3);
        ringBuffer.add(4);
        ringBuffer.add(5);

        Iterator<Integer> ringIt = ringBuffer.iterator();
        while (ringIt.hasNext()) {
            System.out.println(ringIt.next());
        }

    }

}
