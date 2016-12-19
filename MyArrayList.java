
public class MyArrayList<T> {

	private int initialCapacity;
	private T[] array;

	public MyArrayList(int initialCapacity) {
		this.initialCapacity = initialCapacity;
		this.array = (T[]) new Object[this.initialCapacity];
	}

	public MyArrayList() {
		this(10);
	}

	public int getInitialCapacity() {
		return this.initialCapacity;
	}

	public int size() {
		return 0;
	}

	public boolean add(T element) {
		return false;
	}

	public int indexOf(Object o) {
		return -1;
	}

	public T get(int index) {
		return (T) array[index];
	}

	public void add(int index, T element) {

	}

	public void clear() {

	}

	public boolean contains(Object o) {
		return false;
	}

	public T removeIndex(int index) {
		return (T);
	}

	public T removeObject(Object o) {
		return (T);
	}

	public T set(int index, T element) {
		return (T) array[index];
	}

	public boolean isEmpty() {
		return true;
	}

	public void ensureCapacity() {

	}

}
