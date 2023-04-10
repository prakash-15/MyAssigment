package week3.day1;

public class Students {
	
public void getStudentInfo(int id) {
		
		System.out.println("Student Id: "+id);
	}
	
	public void getStudentInfo(int id, String name) {
		
		System.out.println("Student Id: "+id+ " Student Name: "+name);
	}
	
	public void getStudentInfo(String email, long phoneNumber) {
		
		System.out.println("Email Id is :" +email);
				
		System.out.println( "Phone Number is :"  +phoneNumber);
		
	}

	public static void main(String[] args) {
		
		Students stud = new Students();
		
		stud.getStudentInfo(401);
		stud.getStudentInfo(401, "Prakash");
		stud.getStudentInfo("nigathsingh@gmail.com",9847333448L);


	}

}
