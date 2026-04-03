public class LinkedList5<T>{
	private static class Node<T>{
		T data;
		Node<T> next;
		
		Node(T value){
			this.data = value;
			this.next = null;
			
		}
	}
	
	private Node<T> head;
	private Node<T> tail;
	private int size;
	
	
	public void add(T value){
		Node<T> newNode = new Node<>(value);
		
		if( head == null){
			head = newNode;
			tail = newNode;
			
		}
		else{
			tail.next = newNode;
			tail = newNode;
			
		}
		
		size++;
		
	}
	
	public void insert( T value, T afterValue){
		 Node<T> current = head;
		 while(current != null && !current.data.equals(afterValue)){
			 current = current.next;
			 
		 }
		 
		 if( current == null){
				throw new IllegalArgumentException();
		 }
		 
		 Node<T> newNode = new Node<>(value);
		 newNode.next = current.next;
		 current.next = newNode;
		 
		if( current == tail){
			tail = newNode;
		}
		size++;
		
	}
	
	public int size(){
		return size;
	}
	
	public void print(){
		Node<T> current = head;
		while(current != null){
			System.out.print(current.data + " -> ");
			current = current.next;
			
		}
		System.out.print("null");
		
		
	}
	
	public void remove(T value){
		if(head == null){
			return;
		}
		
		if(head.data.equals(value)){
			head = head.next;
			
			if(head == null){
				tail = null;
			}
			size--;
			return;
		}
		
		Node<T> current = head;
		while(current.next != null && !current.next.data.equals(value)){
			current = current.next;
		}
		if(current.next == null){
			
			return;
		}
		
		current.next = current.next.next;
		
		
		if(current.next == null){
			tail = current;
			
		}
		
		size--;
		
			
		
		
		
		
	}
	
	public static void main(String[] args){
		LinkedList5<Integer> list = new LinkedList5<>();
		list.add(10);
		list.add(20);
		list.insert(15,10);
		list.remove(15);
		list.print();
		System.out.print("Size: " + list.size());
		
		LinkedList5<String> list1 = new LinkedList5<>();
		list1.add("Hello");
		list1.add("World");
		list1.insert("Hi", "Hello");
		list1.remove("Hi");
		list1.print();
		System.out.print("Size: " + list1.size());
		
		
	}


}