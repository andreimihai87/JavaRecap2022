package amd.caveofprogramming.section22.l260;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class App {

	public static void main(String[] args) {

		int value = 0x01020304;

		ByteBuffer buffer = ByteBuffer.allocate(4);
		buffer.order(ByteOrder.LITTLE_ENDIAN);
		buffer.putInt(value);

		byte[] bytes = buffer.array();

		for (byte b : bytes) {
			System.out.printf("%02x ", b);
		}

	}

}
