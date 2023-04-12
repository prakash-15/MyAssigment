package week3.day3;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String name="babu";
	String nm="";
	char[] cs = name.toCharArray();
	Set<Character> val=new HashSet<Character>();
	for (Character c : cs) 
	{
		//value.add(c);
		if(!(val.add(c)))
		{
			val.remove(c);
		}
	}
	for (Character j : val) 
	{
		nm=nm+j;
	}
	
	System.out.println(nm);
}
}
