
public class MyArrayList<T> {

	private int initialCapacity;
	private T[] array; 
	
	public MyArrayList(int initialCapacity){
		this.initialCapacity = initialCapacity;
		this.array = (T[])new Object[this.initialCapacity];
	}
	
	public MyArrayList(){
		this(10);
	}
	
	public int getInitialCapacity(){
		return this.initialCapacity;
	}
	
	public int size(){
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			count++;
		}
		return count;
	}
	
	public boolean add(T element){
		for(int i =0; i < array.length;i++){
			
		}
		return true;
	}
	
	public int indexOf(Object o){
		for (int i = 0; i < array.length; i++) {
			if (array[i] == o) {
				return i;
			}
		}
		return -1;
	}
	
	public T get(int index){
		for (int i = 0; i < array.length; i++) {
			if (array[i] == array[index]) {
				return array[i];
			}
		}
		return (T) array[index];
	}
	public void add(int index, T element){
		for(int i = 0; i < array.length;i++){
			array[index] = element;
		}
	}
	public void clear(){
		for (int i = 0; i < array.length; i++) {
			array[i] = null;
		}
	}
	public boolean contains(Object o){
			return true;
		}
	public T removeIndex(int index){
		int i;
		for (i = 0; i < array.length; i++) {

			if (i == index) {
				array[index] = null;
			}
		}
		return (T) array[i];
	}
	public T removeObject(Object o){
		return (T);
	}
	public boolean isEmpty(){
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				return true;
			}
		}
		return false;
	}
	public void ensureCapacity(){
		
	}
	public T remove(int index){
		return(T);
	}
	public T set(int index, T element){
		if (index < this.size() - 1) {
			array[index] = element;
		}
		return (T) element;
		}
	public boolean remove(Object o){
		for(int i = 0; i < array.length; i++) {
			if(array[i] == o){
				array[i] = null;
			}
		return true;
		}
		return false;
	}
}
