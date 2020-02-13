package com.cg.lab2.assignment1;

public abstract class Item {
	
	private int identificatioNumber, numberOfCopies;
	private String title;
	

	public Item(int identificatioNumber, int numberOfCopies, String title) {
		super();
		this.identificatioNumber = identificatioNumber;
		this.numberOfCopies = numberOfCopies;
		this.title = title;
	}

	public int getIdentificatioNumber() {
		return identificatioNumber;
	}

	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	public String getTitle() {
		return title;
	}

	public void setIdentificatioNumber(int identificatioNumber) {
		this.identificatioNumber = identificatioNumber;
	}

	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	abstract public void print();
	
	abstract public void checkIn();
	
	abstract public void checkOut();


}

