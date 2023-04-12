package week3.day3;


import java.util.LinkedHashSet;
import java.util.Set;

public class StringUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "google";
		
		
		char[] ary1 = str1.toCharArray();
		Set<Character> dub=new LinkedHashSet<Character>();
		for (Character c : ary1) {
			dub.add(c);
			
		}
	
		System.out.println(dub);
	}
	
	

}
