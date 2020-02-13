package com.cg.lab7.assignment6;

import java.util.ArrayList;
import java.util.HashMap;

public class EligibleToVote 
{
	public ArrayList<String> voterList(HashMap<String,Integer> map)
	{
		ArrayList<String> newVoterList=new ArrayList<String>();
		for(String name:map.keySet())
		{
			if(map.get(name)>18)
				newVoterList.add(name);
		}
		return newVoterList;
	}

}
