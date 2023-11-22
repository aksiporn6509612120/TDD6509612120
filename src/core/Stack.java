package core;

import java.util.ArrayList;

public class Stack implements IStack {
	private ArrayList<Object> elm = new ArrayList<>();
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public boolean isFull() {
		return false;
	}
	
	public void push(Object elm) {
		this.elm.add(elm);
	}
	
	
	public Object top() {
		return elm.get(elm.size()-1);
	}
	
	public Object pop() {
		// TODO Auto-generated method stub
		return elm.get(elm.size()-1);
	}

	@Override
	public void pop(Object elm) {
		// TODO Auto-generated method stub
		
	}
}
