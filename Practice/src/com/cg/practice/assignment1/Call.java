package com.cg.practice.assignment1;

public class Call 
{
	private int callID;
	private long calledNumber;
	private float duration;
	public int getCallID() 
	{
		return callID;
	}
	public void setCallID(int callID) 
	{
		this.callID = callID;
	}
	public long getCalledNumber() 
	{
		return calledNumber;
	}
	public void setCalledNumber(long calledNumber) 
	{
		this.calledNumber = calledNumber;
	}
	public float getDuration() 
	{
		return duration;
	}
	public void setDuration(float duration) 
	{
		this.duration = duration;
	}
	public void parseData(String input)
	{
		setCallID(Integer.parseInt(input.substring(0,input.indexOf(":"))));
		setCalledNumber(Long.parseLong(input.substring(input.indexOf(":")+1,input.lastIndexOf(":"))));
        setDuration(Float.parseFloat(input.substring(input.lastIndexOf(":")+1)));
	}
}