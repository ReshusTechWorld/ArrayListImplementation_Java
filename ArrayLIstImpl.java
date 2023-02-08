package com.java.core.arraylist;

public class ArrayLIstImpl {
	Object arr[] = new Object[3];
	int pos = 0;

	public void add(Object e) {

		if (pos >= arr.length) {
			increaseSize();
		}
		arr[pos++] = e;

	}

	private void increaseSize() {
		int newSize = arr.length + (arr.length / 2);
		Object newArray[] = new Object[newSize];
		for (int i = 0; i < arr.length; i++) {
			newArray[i] = arr[i];
		}
		arr = newArray;
	}

	public void updateElement(int p, Object element) {
		if (p >= arr.length) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			arr[p - 1] = element;
		}
	}

	public void deleteElement(int p) {
		if (p >= arr.length) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			for (int i = p - 1; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];

			}
			pos--;

		}
	}

	public int getArraySize() {
		return pos;
	}

	@Override
	public String toString() {
		if (pos == 0) {
			return "[]";
		}
		String s = "[" + arr[0];
		for (int i = 1; i < pos; i++) {
			s = s + "," + get(i);
		}
		s = s + "]";
		return s;
	}

	private Object get(int i) {
		if (i >= arr.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return arr[i];
	}

}
