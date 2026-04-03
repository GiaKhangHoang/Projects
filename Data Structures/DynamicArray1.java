public class DynamicArray1<T> {
    private T[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public DynamicArray1() {
        this.data = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public DynamicArray1(int capacity) {
        if (capacity < 0) {
            throw new RuntimeException("Capacity must be > 0");
        }
        this.data = (T[]) new Object[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        checkIndex(index);
        return data[index];
    }

    public T set(int index, T value) {
        checkIndex(index);
        T oldValue = data[index];
        data[index] = value;
        return oldValue;
    }

    public void add(T value) {
        ensureCapacity();
        data[size++] = value;
    }

    public void insert(int index, T value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        ensureCapacity();

        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }

        data[index] = value;
        size++;
    }

    public T remove(int index) {
        checkIndex(index);

        T removed = data[index];

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        data[size - 1] = null;
        size--;

        return removed;
    }

    private void ensureCapacity() {
        if (size == data.length) {
            grow();
        }
    }

    private void grow() {
        int newCapacity = data.length * 2;
        T[] newData = (T[]) new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }

        data = newData;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }
	
	public static void main(String[] args){
		DynamicArray1<Integer> arr = new DynamicArray1<>(2);
		arr.add(5);
		arr.add(10);
		arr.add(15);
		System.out.println("Third item: " + arr.get(2));
		arr.remove(2);
		arr.insert(2,20);
		System.out.println("New third item: " + arr.get(2));
		System.out.println("Old value for second item: " + arr.set(1, 15));
		
		
		
	}
}