package week2.day1;

public class FindArrayDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {2,5,7,7,5,9,2,3};
		
		for (int i = 0; i < nums.length; i++) 
		
		{
			for (int j= i+1; j < nums.length; j++) 
			{
				if(nums[i]==nums[j]) 
				{
				System.out.println( "The Duplicate is: "+nums[i]);	
				}
			}
		}

	}

}
