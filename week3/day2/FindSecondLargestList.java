package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	

	List<Integer> List1 =new ArrayList<Integer>();
		
		List1.add(3);
		List1.add(2);
		List1.add(11);
		List1.add(4);
		List1.add(6);
		List1.add(7);
		
		int size1 = List1.size();
		Collections.sort(List1);
		
		System.out.println("Second Largest Number is : "+List1.get(size1-2));
	

}
	}
