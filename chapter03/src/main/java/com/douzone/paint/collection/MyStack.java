package com.douzone.paint.collection;

public class MyStack<T> {
	private int top;
	private T[] buffer;

	@SuppressWarnings("unchecked")
	public MyStack(int capacity) {
		top = -1;
		buffer = (T[])new Object[capacity];
	}

	public void push(T t) {
		if (top == buffer.length - 1) {
			resize();
		}

		buffer[++top] = t;		
	}

	public T pop() throws MyStackException {
		if (isEmpty()) {
			throw new MyStackException("stack is empty");
		}

		T result = buffer[top];		
		buffer[top--] = null;

		return result;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	@SuppressWarnings("unchecked")
	private void resize() {
		T[] temp = (T[])new Object[buffer.length * 2];
		for (int i = 0; i <= top; i++) {
			temp[i] = buffer[i];
		}

		buffer = temp;
	}
}