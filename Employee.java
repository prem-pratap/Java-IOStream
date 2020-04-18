import java.io.*;
import java.util.Date;
class Employee implements Serializable {
	String name;
	String department;
	String designation;
	double salary;
	Date dateOfBirth;

	Employee() {
		System.out.println("Non parameterised default constructor");
	}
	Employee(String n,String dept,String desig,double sal,Date d){
		this.name=n;
		this.department=dept;
		this.designation=desig;
		this.salary=sal;
		this.dateOfBirth=d;
				
	}
	//setters
	protected void setName(String name) {
		this.name=name;
	}
	protected void setDepartment(String dept) {
		this.department=dept;
	}
	protected void setDesignation(String desig) {
		this.designation=desig;
	}
	protected void setSalary(double sal) {
		this.salary=sal;
	}
	protected void setDOB(Date d) {
		this.dateOfBirth=d;
	}

	//getters
	protected String getName() {
		return name;
	}
	
	protected String getDepartment() {
		return department;
	}
	protected String getdesignation() {
		return designation;
	}
	protected double getSalary() {
		return salary;
	}
	protected String getDate() {
		return dateOfBirth.getYear()+"/"+dateOfBirth.getMonth()+"/"+dateOfBirth.getDate();
	} 
	public String toString() {
		return "Name: " + name + " Dob: " + getDate() + " Department: " + department + " Designation: " + designation
				+ " Salary: " + salary ;}
}


