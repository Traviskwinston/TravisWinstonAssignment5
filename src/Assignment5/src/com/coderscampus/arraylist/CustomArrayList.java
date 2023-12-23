package Assignment5.src.com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	private int size; //Keep track of the current index

	@Override
	public boolean add(T item) {
		if (size == items.length) {
            // Array is full, need to resize
            items = Arrays.copyOf(items, items.length * 2);
        }
		//if it's not full, add the item to the array at the index 'size'
        items[size++] = item;
        return true;
	}

	@Override
	public int getSize() {
		return size; //size should be dynamically updating with elements being added
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		if (!items[index].equals(null)) {
			return (T) items[index];
		} else 
		return null;
	}
	
}
