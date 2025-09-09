package com.day2.stackapp.impl;
//Sumit LL
public class StackLinkListImpl implements Stack{
	private int arr[];
	private final int SIZE;
	private int top;

	public StackLinkListImpl(int size) {
		SIZE = size;
		arr = new int[SIZE];
		top = -1;// stack is empty right now ...
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("stack is empty");
			return -999;
		}

		return arr[top--];
	}

	public void push(int ele) {
		if (isFull()) {
			System.out.println("stack is full");
			return;
		}
		arr[++top] = ele;
	}

	public boolean isFull() {
		return top == SIZE - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}
}