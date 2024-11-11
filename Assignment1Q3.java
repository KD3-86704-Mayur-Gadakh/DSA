package com.sunbeam;

import java.lang.reflect.Array;
import java.util.Scanner;

class Emp{

		int empid;
		String name;
		

		Emp(){};




		 Emp(int empid, String name) {
			this.empid = empid;
			this.name = name;
		}

		
		

		public int getEmpid() {
			return empid;
		}




		public void setEmpid(int empid) {
			this.empid = empid;
		}




		public String getName() {
			return name;
		}




		public void setName(String name) {
			this.name = name;
		}

		
		@Override
		public String toString() {
			return "Assignment1Q3 [empid=" + empid + ", name=" + name + "]";
		}
	
}



public class Assignment1Q3 {


	public static void main(String[] args) {

		Emp[] emp =new Emp[5];
		
		emp[0] = new Emp(1,"mayur");
		emp[1] = new Emp(2,"onkar");
		emp[2] = new Emp(3,"nishikant");
		emp[3] = new Emp(4,"nishad");
		emp[4] = new Emp(5,"abhishek");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the empid:");
		int empid=sc.nextInt();
		
		for (int i = 0; i < emp.length; i++) {
			if(empid==emp[i].empid) {
				System.out.println("employee found at index"+emp[i]);
			}
		}
		
		System.out.println("Enter the name");
		String empName=sc.next();
		
		for (int i = 0; i < emp.length; i++) {
	
			if(empName.equals(emp[i].name)) {
				System.out.println("employee found :"+emp[i]);
			}
		}
		
	}

}
