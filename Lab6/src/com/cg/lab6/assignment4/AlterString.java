package com.cg.lab6.assignment4;

public class AlterString 
{
	public String alterString(String s)
	{
		String result="";
		int i=0;
		int n=s.length();
		while(i<n) {
			char c=s.charAt(i);
			if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'||c==' ')
			{
				result+=c;
			}
			else if(c=='Z'){
				result+='A';
			}
			else if(c=='z'){
				result+='a';
			}
			else {
				c++;
				result+=c;
			}
			i++;
		}
		return result;
	}
}
