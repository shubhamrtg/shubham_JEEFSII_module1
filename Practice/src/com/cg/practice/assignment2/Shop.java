package com.cg.practice.assignment2;
import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;


public class Shop 
{
	private Map<Integer,String> productMap=new TreeMap<Integer,String>();

	public Map<Integer, String> getProductMap() 
	{
		return productMap;
	}

	public void setProductMap(Map<Integer, String> productMap) 
	{
		this.productMap = productMap;
	}
	public void addProductDetail(int serialNumber, String productName)
	{
		productMap.put(serialNumber,productName);
	}
	public List<String> searchBasedOnProduct(String productType)
	{
		List<String> listOfProduct=new ArrayList<String>();
		for(Integer i:productMap.keySet())
		{
			if(productMap.get(i).contains(productType))
			{
				listOfProduct.add(productMap.get(i));
			}
		}
		return listOfProduct;
	}
}