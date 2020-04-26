/*Write a program to count the occurrences of each word in an input file and write the word along with its corresponding count in an output file.

[Note: The words should be sorted alphabetically in the output file]
For Example, let's assume the following are the contents of inputFile.txt
Manoj works at Wipro
Katari works at Wipro
Sureka works at Wipro
Harish works at Wipro
Anitha works at Wipro
Janani works at Wipro

D:\>Java FileWordCount inputFile.txt outputFile.txt
After Execution of the program the contents of outputFile.txt should be as below
Anitha : 1
Harish : 1
Janani : 1
Katari : 1
Manoj : 1
Sureka : 1
Wipro : 6
at : 6
works : 6*/
import java.util.TreeMap;
import java.io.*;
public class Exercise4{

	public static void main(String[] args) throws IOException,FileNotFoundException{
		//Treemap is used as it gives sorted map where map is an object which map keys to values.
		TreeMap<String, Integer> map=new TreeMap<String, Integer>();
		String fname=null;
		String dest_name=null;
		try{
		fname=args[0];
		dest_name=args[1];}
		catch(Exception e){
			System.out.println("Please pass source file path as first arguement and destination file path as second arguement");}
		File finput=null;
		BufferedReader br=null;		
		try {
			 finput=new File(fname);
			 br = new BufferedReader(new FileReader(finput));
		//reading file and counting map each word with its count
			String str;	
		while ((str = br.readLine()) != null) {
			String[] words = str.split(" ");
			
			for (String word : words) {
				if (!map.containsKey(word))
					map.put(word, 1);
				else
					map.put(word, map.get(word) + 1);
				}		
			}
		}catch(FileNotFoundException fe) {
			System.out.println("File Not Found");
		}
		catch(IOException ie) {
			System.out.println("Input Output Exception");
		}try {
			
			FileOutputStream outputStream = new FileOutputStream(dest_name);
		    
		//Displaying the result
		for(String key:map.keySet()) {
			String s=key+" : "+map.get(key)+"\n";
			byte[] strToBytes = s.getBytes();
			    outputStream.write(strToBytes);
			System.out.println(s);
			}
		outputStream.close();
		}catch(IOException ie) {
			System.out.println("IOException occurred");
		}
		br.close();

		
			
	}
}
