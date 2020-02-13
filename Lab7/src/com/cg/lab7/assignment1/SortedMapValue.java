package com.cg.lab7.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SortedMapValue {
	public ArrayList<Integer> sortValues(HashMap<?, Integer> map)
	{
		ArrayList<Integer> values=new ArrayList<Integer>(map.values());
		Collections.sort(values);
		return values;	
	}

}
