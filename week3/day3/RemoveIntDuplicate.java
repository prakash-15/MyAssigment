package week3.day3;

import java.util.HashSet;
import java.util.Set;



public class RemoveIntDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] num={3,5,7,2,5,7,9,2,1,54,8,4,6,4,8};
		 Set<Integer> dub=new HashSet<Integer>();
		 
	for (Integer i : num) {
		
		dub.add(i);
				
	}
	System.out.println(dub);
	}

}
