package com.cg.practice.assignment1;

import java.util.ArrayList;
import java.util.List;

public class CallHistory 
{
	private List<Call> callList=new ArrayList<Call>();

	public List<Call> getCallList() {
		return callList;
	}

	public void setCallList(List<Call> callList) {
		this.callList = callList;
	}
	public void addCall(Call callObject)
	{
		callList.add(callObject);
	}
	public float findTotalDuration(long calledNumber)
	{
		float totalDuration=0;
		for(Call call:callList)
		{
			if(call.getCalledNumber()==calledNumber)
				totalDuration=totalDuration+call.getDuration();
		}
		return totalDuration;
	}
}