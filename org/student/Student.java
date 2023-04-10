package org.student;

import org.department.Department;

public class Student extends Department {

	
	public void studentName()
	{
		System.out.println("Student Name: PRAKASH");
		
	}
	public void studentDept()
	{
		System.out.println("Student Departments is IT");
	}
	
	public void studentId()
	{
		System.out.println("Student ID is 23183");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stud = new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.deptName();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
	}

}
