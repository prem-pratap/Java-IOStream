/*Write a program to count the number of times a character appears in a File. 

[Note :  The character check is case insensitive... i.e, 'a' and 'A' are considered to be the same]

Sample Input and Output:
Enter the file name
Input.txt
Enter the character to be counted
r
File 'Input.txt' has 99 instances of letter 'r'.*/

import java.io.*; 
public class Exercise1 {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		BufferedReader brobj=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of file: ");
		String filename=brobj.readLine();
		System.out.println("Enter character whose count is required:");
		char ch=(char) brobj.read();
		ch=Character.toLowerCase(ch);
		int count=0;
		int charread;
		
		try {
			
			FileReader inp=new FileReader(filename);
			do {
				charread=inp.read();
				if(Character.isUpperCase((char)charread))
					charread=Character.toLowerCase((char)charread);
				if(ch==charread)
					count++;
				
			}while(charread != -1);

		System.out.println("FileName '"+filename+"' has "+count+" instances of letter '" +ch+"'.");
		}catch(FileNotFoundException fe){
			System.out.println("File not found");	
		}catch(IOException ie) {
			System.out.println("Input Output Exception");
		}
		
		
		
	}

}

