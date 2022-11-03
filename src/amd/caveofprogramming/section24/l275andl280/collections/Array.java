package amd.caveofprogramming.section24.l275andl280.collections;

public class Array<E> {

	private E[] array;
	private int position;

	@SuppressWarnings("unchecked")
	public Array(int size) {

		array = (E[]) new Object[size];

	}

	public void add(E element) {

		if (position == array.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		array[position++] = element;

	}

	public E get(int index) {

		if (index > array.length - 1) {
			throw new ArrayIndexOutOfBoundsException();
		}

		return array[index];
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		for (E element : array) {
			sb.append(element.toString());
			sb.append(" ");
		}

		return sb.toString();
	}
	
	public int size() {
		return position;
	}

}
