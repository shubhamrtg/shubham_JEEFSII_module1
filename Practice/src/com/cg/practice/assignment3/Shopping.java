package com.cg.practice.assignment3;

public class Shopping 
{
	private String product;
	private int price;
	private double discount;
	private double discountedAmount;
	
	public String getProduct()
	{
		return product;
	}
	public void setProduct(String product) 
	{
		this.product = product;
	}
	public int getPrice() 
	{
		return price;
	}
	public void setPrice(int price) 
	{
		this.price = price;
	}
	public double getDiscount() 
	{
		return discount;
	}
	public void setDiscount(double discount) 
	{
		this.discount = discount;
	}
	public double getDiscountedAmount() 
	{
		return discountedAmount;
	}
	public void setDiscountedAmount(double discountedAmount)
	{
		this.discountedAmount = discountedAmount;
	}
	public void parseData(String input)
	{
		setProduct(input.substring(0,input.indexOf(",")));
		setPrice(Integer.parseInt(input.substring(input.indexOf(",")+1,input.lastIndexOf(","))));
		setDiscount(Double.parseDouble(input.substring(input.lastIndexOf(",")+1)));
		setDiscountedAmount(price*(discount/100));
	}
}
