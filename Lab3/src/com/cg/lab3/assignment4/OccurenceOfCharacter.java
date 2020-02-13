package com.cg.lab3.assignment4;

import java.util.HashMap;

public class OccurenceOfCharacter 
{
    public void countOccurence(String inputString) 
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
	    System.out.println(hashObject);
    }
}
