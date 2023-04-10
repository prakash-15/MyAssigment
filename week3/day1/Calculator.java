package week3.day1;

public class Calculator {


		public int addition(int a,int b)
		{
			return a+b;	
		}
		
		public int addition(int a,int b,int c)
		{
			return a+b+c;
		}
		
		public void multiple(int a, double b)
		{
			
			int l=(int) (a*b);
			System.out.println(l);
		}
		
		public double multiple(double a,double b)
		{
			return a*b;
		}
		
		public static void main(String[] args)
		{
			Calculator cal= new Calculator();
			int c = cal.addition(5, 5);
			System.out.println("Addition of two int :"+c);
			
			int d = cal.addition(10, 10, 10);
			System.out.println("Addition of three int: "+d);
			
			
			double multi = cal.multiple(43.58,25.30);
			System.out.println("Mulitiple of two double : "+multi);
			
			
		}
	
		
	}


