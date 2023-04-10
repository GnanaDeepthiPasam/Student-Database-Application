package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp 
{

	public static void main(String[] args) 
	{
		// Student stu1=new Student();
		
		// stu1.enroll();
		// stu1.payTuition();
		// System.out.println("\nNew Student Details:\n\n"+stu1.showInfo());
		
		
		// Ask how many users we want to add
		
		System.out.println("Student Database Application:\n");
		
		System.out.print("Enter number of new students to enroll: ");
		
		Scanner in=new Scanner(System.in);
		int numOfStudents=in.nextInt();
		
		Student students[]=new Student[numOfStudents];
		
		
		// Create n number of new students
		
		for(int k=0;k<numOfStudents;k++) 
		{
			students[k]=new Student();
			students[k].enroll();
			students[k].payTuition();
			
		}
		
		System.out.println("\n\nNew Student Details:");
		
		for(int m=0;m<numOfStudents;m++) 
		{
			System.out.println("");
			System.out.println(students[m].showInfo());
		}
		
	}

}
