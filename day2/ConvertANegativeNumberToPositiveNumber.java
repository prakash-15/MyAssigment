package week1.day2;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		int convert;
		if(num<0)
		{
			
			convert=num*-(1);
			System.out.println("Given Negative number is Converted as Pasitive "+convert);
		}
		
		else if(num>0)
		{
			System.out.println("Give number already a pasitive number " + num);
		}
		else
		{
			System.out.println("The Given Number " +num+ " is neither positive nor negative");
		}
	}
	

}
