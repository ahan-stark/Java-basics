package labprograms;

import java.util.Scanner;

class Student{
	private String USN;
	private String Name;
	private String Branch;
	private String Phone;
	public String getUSN() {
		return USN;
	}
	public String getName() {
		return Name;
	}
	public String getBranch() {
		return Branch;
	}
	public String getPhone() {
		return Phone;
	}
	public Student(String usn,String name,String branch,String phone) {
		USN=usn;
		Name=name;
		Branch=branch;
		Phone=phone;
	}
}

public class firstprogramA {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of students");
		int n;
		n=s.nextInt();
		Student[] st=new Student[n];
		
		String usn,name,branch,phone;
		for(int i=0;i<n;i++) {
			System.out.println("Enter details of students are");
			s.nextLine();
			System.out.println("Enter usn");
			usn=s.nextLine();
			System.out.println("Enter name");
			name=s.nextLine();
			System.out.println("Enter branch");
			branch=s.nextLine();
			System.out.println("Enter phone");
			phone=s.nextLine();
			st[i]=new Student(usn,name,branch,phone);
		
		}
		System.out.println("Student details are");
		System.out.println("usn\t\t Name\t\t\t Branch\t\t phone ");
		for(int i=0;i<n;i++) {
		System.out.println(st[i].getUSN()+"\t\t"+st[i].getName()+"\t\t\t"+st[i].getBranch()+"\t\t"+st[i].getPhone());
		
		}
		s.close();
		
		
						
					

	}

}
