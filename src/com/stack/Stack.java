package com.stack;

import com.utility.OneWayNode;

import java.util.Scanner;

/**
 * Class for stack operations
 */
public class Stack {
	//Top node of stack
	private OneWayNode TOP;
	
	public Stack() {
		TOP = null;
	}
	
	public OneWayNode createNewNode(int data) {
		OneWayNode node = new OneWayNode();
		node.setData(data);
		node.setNext(null);
		return node;
	}
	
	public void push() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to push");
		int num=  scanner.nextInt();
		
		OneWayNode node = createNewNode(num);
		if(null == TOP) {
			TOP = node;
			System.out.println(num + " pushed in stack");
		} else {
			node.setNext(TOP);
			TOP = node;
			System.out.println(num + " pushed in stack");
		}
	}
	
	public void pop() {
		if(null == TOP) {
			System.out.println("Stack underflow");
			return;
		}
		
		OneWayNode temp = TOP;
		System.out.println(TOP.getData() + " poped from stack");
		TOP = TOP.getNext();
		temp = null;
	}
	
	public void print() {
		if(null == TOP) {
			System.out.println("Stack underflow");
			return;
		}
		
		for(OneWayNode node = TOP; node != null; node=node.getNext())
			System.out.println("| "+node.getData()+" |");
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		Scanner input = new Scanner(System.in);		
		int choice;
		do{
			System.out.println("1. Push\n2. Pop\n3. Print\n0. Exit");
			choice = input.nextInt();
			switch(choice){
				case 1:
					stack.push();
					break;
				case 2:
					stack.pop();
					break;
				case 3:
					stack.print();
					break;
			}
		}while(choice != 0);
	}
}
