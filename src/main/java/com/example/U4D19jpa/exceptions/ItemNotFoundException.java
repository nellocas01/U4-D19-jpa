package com.example.U4D19jpa.exceptions;

public class ItemNotFoundException extends RuntimeException {

	public ItemNotFoundException() {
		super("Item not found");
	}

	public ItemNotFoundException(int id) {
		super("Item with id " + id + " not found");
	}
}
