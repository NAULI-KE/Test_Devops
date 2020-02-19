package com.example.demo.commons;

public enum ResponseMessage {
	CreateSuccess("was created successfully!"), UpdateSuccess("was updated successfully!"),
	CreateFailed("was not created successfully. please try again!"),
	UpdateFailed("was not updated successfully. please try again!"),
	UnkwownError("Unkwown Error just happend. please contact your system administrator!");

	public final String message;

	private ResponseMessage(String message) {
		this.message = message;
	}
}
