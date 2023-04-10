package studentdatabaseapp;

import java.util.Scanner;

public class Student 
{
	// Writing the application properties as variables and making them as 'private'
	
	private String firstName;
	private String lastName;
	private String gradeYear;
	private int choice;
	private String studentID;
	private String courses=" "; // IMP
	private int tuitionBalance=0;
	private static int courseCost=600;
	private static int id=1000;
	
	
	// Constructor: prompt user to enter student's name and year
	
	public Student() 
	{
		Scanner in=new Scanner(System.in);
		
		System.out.print("\nEnter student first name: ");
		this.firstName=in.nextLine(); // 'nextLine' will take the string
		System.out.print("Enter student last name: ");
		this.lastName=in.nextLine(); // 'nextLine' will take the string
		
		this.gradeYear=setClassLevel();
		
		setStudentID();
		
		// System.out.println("\n"+this.firstName+" "+this.lastName+" "+this.gradeYear+" "+this.studentID);
		
	}
	
	// Class level
	
		private String setClassLevel() 
		{
			System.out.print("\nClass Levels:\n 1. Freshman\n 2. Sophomore\n 3. Junior\n 4. Senior\nEnter student class level: ");
			
			Scanner level=new Scanner(System.in);
			this.choice=level.nextInt();
			
			if(choice==1) 
			{
				return "Freshman";
				
			}
			
			else if(choice==2) 
			{
				return "Sophomore";
				
			}
			
			else if(choice==3) 
			{
				return "Junior";
				
			}
			
			else if(choice==4)
			{
				return "Senior"; 
				
			}
			
			else 
			{
				return "";
				
			}
			
		}
	
	
	// Generate an ID
	
	private void setStudentID() 
	{
		id++;
		this.studentID=choice+""+id; // Grade level + id
		
	}
	
	
	// Enroll in courses
	
	public void enroll() 
	{
		System.out.println(" ");
		
		do 
		{
			System.out.print("Enter courses to enroll: (Q to quit): ");
			Scanner in=new Scanner(System.in);
			
			String course=in.nextLine();
			
			if(course.equals("Q")) 
			{
				break;				
			}
			
			else 
			{
				courses=courses+"\n "+". "+course;
				tuitionBalance=tuitionBalance+courseCost;		
				
			}
			
		}while(1!=0);
		
		
		System.out.println("\nCourses Enrolled:"+courses);
	    
		System.out.println("\nTuition Balance ($): "+tuitionBalance+" ");
		
	}
	
	
	// View balance
	
	public void viewBalance() 
	{
		System.out.println("Net Balance ($): "+tuitionBalance+"\n");
		
	}
	
	
	// Pay tuition
	
	public void payTuition() 
	{
		System.out.print("Enter your payment ($):"+" ");
		
		Scanner in=new Scanner(System.in);
		int payment=in.nextInt();
		
		tuitionBalance=tuitionBalance-payment;
		System.out.println("\nThank you for your payment:)");
		
		// viewBalance();
		
	}
	
	
	// Show student status
	
	public String showInfo() 
	{
		return "Student ID: "+this.studentID+"\nStudent Name: "+this.lastName+", "+this.firstName+"\nGrade Year: "+this.gradeYear+"\nCourses Enrolled: "+courses+"\nNet Balance ($): "+this.tuitionBalance;
		
	}
	
}
