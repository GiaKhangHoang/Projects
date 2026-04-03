public class stackArray5<T>{
	private T[] arr;
	private int top;
	private int capacity;
	
	@SuppressWarnings("unchecked")
	public stackArray5(int size){
		this.arr = (T[]) new Object[size];
		top = -1;
		capacity = size;
		
		
	}
	
	public void push(T x){
		if( top == capacity - 1){
			System.out.println("Stack overflowed");
			arr = grow(arr);
			capacity = arr.length;
			
		}
		
		arr[++top] = x;
		
	}
	
	public T pop(){
		if(top == -1){
			System.out.println("Stack underflowed");
			return null;
			
		}
		return arr[top--];
		
	}

	public T peek(){
		if(top == -1){
			System.out.println("Stack is empty");
			return null;
			
		}
		
		return arr[top];
		
	}
	
	public void print(){
		for(int i = 0; i<=top; i++){
			System.out.print(arr[i] + ", ");
			
		}
		System.out.print("\n");
		
	}
	
	public T[] grow(T[] arr){
		T[] arr1 = (T[]) new Object[2 * capacity];
		for(int i = 0; i<= top; i++){
			arr1[i] = arr[i];
		}
		arr = arr1;
		return arr;
		
	}
	
	public static void main(String[] args){
		stackArray5<Integer> s = new stackArray5<>(2);
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println("Last item: " + s.peek());
		s.print();
		s.pop();
		s.print();
		
	}


}