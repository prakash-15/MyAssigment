package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> List1 =new ArrayList<Integer>();
		
		List1.add(3);
		List1.add(2);
		List1.add(11);
		List1.add(4);
		List1.add(6);
		List1.add(7);
		
		System.out.println(List1);
		
		List<Integer> List2 =new ArrayList<Integer>();
		
		List2.add(1);
		List2.add(2);
		List2.add(8);
		List2.add(4);
		List2.add(9);
		List2.add(7);
		
		System.out.println(List2);
		
		int size1 = List1.size();
		int size2 = List2.size();
		
	
		
		for (int i = 0; i < size1; i++) {
			
			for (int j = 0; j <size2; j++) {
				
				if(List1.get(i)==List2.get(j))
				{
					//System.out.println("The Intersect numbers are :"+List2.get(j));
					
					List<Integer> List3 =new ArrayList<Integer>();
					
					 List3.add(List2.get(j));
					 
					 System.out.print(List3);
				}
			}
			
		}
		
		
		
		

	}

}
