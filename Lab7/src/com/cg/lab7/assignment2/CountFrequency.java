package com.cg.lab7.assignment2;

import java.util.HashMap;

public class CountFrequency 
{
	public HashMap<?,?> countCharacter(String inputString) 
    {
	    HashMap<Character,Integer> hashObject = new HashMap<Character,Integer>();
	    char[] charArray=inputString.toCharArray();
	    for(char charInString:charArray) 
	    {
		    if(hashObject.containsKey(charInString)) 
		    {
			    hashObject.put(charInString, (hashObject.get(charInString)+1));
		    }
    		else 
	    	{
		    	hashObject.put(charInString,1);
		    }
	    }
	    return hashObject;
    }
}
