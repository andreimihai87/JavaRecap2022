package amd.caveofprogramming.section24.l275andl282.collections;

import amd.caveofprogramming.section24.l275andl282.hierarchy.Mammal;

public class Util {

	public static void copy(Array<? extends Mammal> source, Array<? super Mammal> destination) {

		if (destination.size() <= source.size()) {
			for (int i = 0; i < source.size(); i++) {
				destination.add(source.get(i));
			}
		} else {
			throw new ArrayStoreException();
		}

	}

}
