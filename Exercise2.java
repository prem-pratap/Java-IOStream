import java.io.*;
import java.lang.Exception;
public class Exercise2 {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		BufferedReader brobj=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of source file: ");
		String filename1=brobj.readLine();
		System.out.println("Enter the name of destination file: ");
		String filename2=brobj.readLine();
		int ch=0;
		FileInputStream finput;
		FileOutputStream foutput;
		try {
		finput=new FileInputStream(filename1);}
		catch(FileNotFoundException fe) {
			System.out.println("File Not Found");
			return;
		}
		try {
			foutput=new FileOutputStream(filename2);
		}catch(IOException e) {
			System.out.println("Error Opening destination file");
			return;
		}
		try {
		while((ch=finput.read())!=-1) 
				foutput.write(ch);}
		catch(IOException e) {
			System.out.println("File Error");
		}
		if (ch==-1)
			System.out.println("File copied successfully");
		else
			System.out.println("Failure");
		
		brobj.close();
		foutput.flush();
		
	}

}
