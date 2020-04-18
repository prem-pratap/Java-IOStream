package TM05_Proj1;

import java.lang.Exception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
public class TestEmployee {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee();
		FileOutputStream fos=null;
		ObjectOutputStream oos = null;
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fos=new FileOutputStream("Employee_Data.dat");
			oos=new ObjectOutputStream(fos);
			fis=new FileInputStream("Employee_Data.dat");
			ois = new ObjectInputStream(fis);}
			
		catch(FileNotFoundException fe) {
			fe.getMessage();
		}
		catch(IOException ie) {
			ie.getMessage();
		}
			int ch=0;
			try {
				do {
					System.out.println("Main Menu\n1. Add an Employee\n2. Display All\n3. Exit");
					ch=sc.nextInt();
					switch(ch) {
					case 1:
						
						System.out.println("Enter Employee ID:");
						emp.setId(sc.nextInt());
						System.out.println("Enter Employee Name:");
						emp.setName(sc.next());
						System.out.println("Enter Employee Age:");
						emp.setAge(sc.nextInt());
						System.out.println("Enter Salary:");
						emp.setSalary(sc.nextDouble());
						oos.writeObject(emp);
						oos.flush();
						break;
					case 2:
						System.out.println("----Report----");
						emp=null;
						while(fis.available()>0) {
							emp=(Employee)ois.readObject();
							System.out.println(emp);}
						System.out.println("----End of Report----");
						break;
					case 3:
						System.out.println("Exiting the System");
						break;
				
					}
				}while(ch!=3);
			}catch(Exception e){
				System.out.println("Exception occurred while serialization");	
			}
		}
	}
