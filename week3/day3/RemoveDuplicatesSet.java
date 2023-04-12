package week3.day3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesSet {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 String str ="We learn java basics as part of java sessions in java week1";
		  
		 String[] split = str.split(" ");
		 String str2="";
		 Set<String> dub=new LinkedHashSet<String>();
		 for (String val1 : split) 
		 {
			dub.add(val1);
		}
		 
		 List <String> list = new ArrayList<String>(dub);
		 
		 for (String val2 : list) {
			 
			 str2=str2+" "+val2;
			
		} 
		
		 System.out.println(str2);
	}

}
