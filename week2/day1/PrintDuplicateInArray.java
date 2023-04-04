package week2.day1;

public class PrintDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arry= {14,12,13,11,15,14,18,16,17,19,18,17,20};
int length=arry.length;
int count;
for (int i = 0; i < arry.length; i++) 
{
	count=0;
	for (int j = i+1; j < arry.length; j++) 
	{
		if(arry[i]==arry[j]) {
			System.err.println(" The Duplicate Number id: "+arry[i]);
		}
	}
}

}

}
