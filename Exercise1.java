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
		}//System.out.println(count);
		
		
		
	}

}
