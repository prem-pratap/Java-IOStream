package TM05_Proj1;

import java.io.Serializable;

public class Employee implements Serializable{
	private int eid;
	private String name;
	private int eage;
	private double salary;
	
	//setters
	protected void setName(String name) {
		this.name=name;
	}
	protected void setId(int id) {
		this.eid=id;
	}
	protected void setAge(int age) {
		this.eage=age;
	}
	protected void setSalary(double salary) {
		this.salary=salary;
	}
	//getters
	protected String getName() {
		return this.name;
	} 
	protected int getId(){
		return this.eid;
	}
	protected int getAge() {
		return this.eage;
	}
	protected double getSalary() {
		return this.salary;
	}
	
	public String toString() {
		return getId()+" "+getName()+" "+getAge()+" "+getSalary();
	}
}	
