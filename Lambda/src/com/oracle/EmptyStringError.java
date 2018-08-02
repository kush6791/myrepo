package com.oracle;

public class EmptyStringError extends Exception {
	public EmptyStringError() {
		super("Empty String");
	}
}
