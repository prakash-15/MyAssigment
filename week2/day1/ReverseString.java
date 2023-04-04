package week2.day1;



public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Orgname="TATA Motors";
char[] TM=Orgname.toCharArray();
System.out.println(TM);

for (int i = TM.length-1; i >=0; i--) {
	System.out.print(TM[i]);
}
	}

}
