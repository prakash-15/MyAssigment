package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingListElements {
	public static void main(String[] args) {
		
		
	List<Integer> List1 =new ArrayList<Integer>();
		
		List1.add(1);
		List1.add(2);
		List1.add(3);
		List1.add(4);
		List1.add(7);
		List1.add(6);
		List1.add(8);
		
		System.out.println(List1);
		
		Collections.sort(List1);
		
		int size1 = List1.size();
		
		for (int i = 0; i < size1; i++) {
			
			int j=i+1;
				
				if(j!=List1.get(i))
				{
					System.out.println("The Missing element is :" +j);
					break;
				}
				
			
			
		}
	}

}
