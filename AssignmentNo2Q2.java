package com.sunbeam;

import java.util.Arrays;

class Employee{
	
	String name;
	int salary;
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
	
}



public class AssignmentNo2Q2 {

	public static void main(String[] args) {
		
		Employee[] emp=new Employee[5];
emp[0]=new Employee("mayur", 10000);		
emp[1]=new Employee("rohit", 40000);		
emp[2]=new Employee("virat", 20000);		
emp[3]=new Employee("hardik", 30000);		
emp[4]=new Employee("shubhamn", 50000);		
	
//Employee e;

for(int i = 1 ; i < emp.length ; i++) {

	for(int j = 0 ; j < emp.length-1 ; j++) {
		//2. if right element is less than left element then swap
		if(emp[j + 1].getSalary() < emp[j].getSalary()) {
			Employee temp = emp[j];
			emp[j] = emp[j + 1];
			emp[j + 1] = temp;
		}
	}
	
	System.out.println("Sorted by salary :"+Arrays.toString(emp));


	}

	}
}
