# Data Structures Practice

This project contains implementations of core data structures in Java, including **Dynamic Array, Linked List, Stack, and Queue**.  
It demonstrates understanding of memory management, algorithm efficiency, and practical problem-solving through building and testing these fundamental structures.

## Implemented Data Structures

### Dynamic Array
- Stores elements dynamically and resizes automatically when full  
- Key methods: `add(value)`, `insert(index, value)`, `remove(index)`, `get(index)`, `set(index, value)`, `size()`  
- Supports generic types for flexibility

### Linked List
- Singly linked list implementation  
- Key methods: `add(value)`, `insert(value, afterValue)`, `remove(value)`, `size()`, `print()`  
- Supports generic types and maintains head/tail references

### Stack (Array-Based)
- LIFO (Last In, First Out) structure  
- Key methods: `push(value)`, `pop()`, `peek()`, `print()`  
- Automatically grows array if capacity is exceeded

### Queue (Array-Based)
- FIFO (First In, First Out) structure  
- Key methods: `enqueue(value)`, `dequeue()`, `peek()`, `isEmpty()`, `isFull()`  
- Circular array implementation to optimize space

## How to Run

1. Navigate to the folder containing the Java files  
2. Compile all files using:
```bash
javac *.java