package week2.day1;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int[] data = {3,2,11,4,6,7};
		int length = data.length;
		Arrays.sort(data);
		
		System.out.println("The Second last value is : " +data[length-2]);
		
		

	}

}
