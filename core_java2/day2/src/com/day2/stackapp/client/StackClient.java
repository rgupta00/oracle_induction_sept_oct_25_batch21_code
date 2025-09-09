package com.day2.stackapp.client;

import com.day2.stackapp.impl.Stack;
import com.day2.stackapp.impl.StackLinkListImpl;

public class StackClient {

	public static void main(String[] args) {
		// :)
		
		Stack stack=new StackLinkListImpl(5);
		stack.push(55);
		stack.push(5);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
	}
}
