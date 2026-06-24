package com.demo;
	
public class MyStack {
	private int a[] = null;
	int  cursor = -1;
	
	MyStack(){
		this(10);
	}
	MyStack(int capacity){
		a = new int[capacity];
	}
	
	public boolean isEmpty() {
		return cursor == -1;
	}
	
	public boolean isFull() {
		return cursor == a.length-1;
	}
	
	public void push(int data) {
		if(!isFull()) {
			a[++cursor] = data;			
		}else {
			throw new StackFullException();
		}
	}
	
	public int pop() {
		if(!isEmpty()) {
			return a[cursor--];
		}else {
			throw new StackEmptyException();
		}
	}
	
	public int size() {
		return cursor +1;
	}
	
	public int peek() {
		return a[cursor];
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		if(!isEmpty()) {
			for(int i = 0;i<size();i++) {
				sb.append(a[i]);
				sb.append(",");
			}
			sb.deleteCharAt(sb.length()-1);
		}
		sb.append("]");
		return sb.toString();
	}
	
}
