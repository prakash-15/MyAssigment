package week3.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="PayPal India";
		String Sp1="";
		char[] ch = name.toCharArray();
		Set <Character> charSet  = new LinkedHashSet <Character>();
		Set <Character> dupCharSet  = new LinkedHashSet <Character>();
		
		for (Character i : ch) {
			
			
			if (!charSet.add(i)) {
				
				dupCharSet.add(i);
			}
		}
		
		for (Character j : dupCharSet) {
			
			Sp1=Sp1+j;
		}
		System.out.println(Sp1);
	}

}

