import java.lang.Exception;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;


public class EmployeeTest {

	public static void main(String[] args) throws Exception {
		Employee emp1=null,emp2=null;
		try {
			
			emp1=new Employee("Kabir Singh","Production","Senior Manager",30000,new Date(1994,10,26));
			System.out.println("Details of employee 1 before serialization:\n"+emp1+"\n");
			FileOutputStream fos=new FileOutputStream("Employee.txt");
			ObjectOutputStream os=new ObjectOutputStream(fos);
			os.writeObject(emp1);
			os.flush();
			os.close();
			fos.close();
		}catch(Exception e) {
			System.out.println("Exception during serialization");
			}
		
		//Changing employee details using emp1 object
		emp1.setName("Siddharth Sharma");
		emp1.setDepartment("Software Testing");
		emp1.setDesignation("Testing Engineer");
		emp1.setDOB(new Date(1996,05,28));
		emp1.setSalary(20000);
		System.out.println("Updated details of emp1 object:\n"+emp1+"\n");
		try {
			FileInputStream fis=new FileInputStream("Employee.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			emp2=(Employee) ois.readObject();
			System.out.println("Details of employee 1 after deserialization:\n"+emp2+"\n");
			fis.close();
			ois.close();
			
		}catch(Exception e) {
			System.out.println("Exception during serialization");
		}
		
		
		
		
	}
}
