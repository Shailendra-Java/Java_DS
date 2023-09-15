package com.utility;

public class OneWayNode {
	//Property to keep data
	public int data;
	//Property to keep reference of next data
	public OneWayNode next;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public OneWayNode getNext() {
		return next;
	}
	public void setNext(OneWayNode next) {
		this.next = next;
	}
}
