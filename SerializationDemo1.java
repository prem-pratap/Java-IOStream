import java.io.*;


 class Demo1 implements Serializable{
	String s;
	int i;
	double d;
	transient double val1;
	Demo1(String s,int i,double d){
		this.s=s;
		this.i=i;
		this.d=d;
	}
	public String toString() {
		return "s="+s+"i="+i+"d="+d;
		
	}
	double value() {
		return val1;
	}
}

public class SerializationDemo1 {

	public static void main(String[] args) throws Exception {
		try{Demo1 obj=new Demo1("Prem",5,23.97);
		System.out.println("Object1:"+obj);
		obj.val1=10;
		System.out.println("Value 1 :"+obj.value());
		FileOutputStream f=new FileOutputStream("Demo1");
		ObjectOutputStream os=new ObjectOutputStream(f);
		os.writeObject(obj);
		os.flush();
		os.close();}
		catch(Exception e) {
			System.out.println("Exception during serialization");
			
		}
		try {
			Demo1 obj2;
			FileInputStream fi=new FileInputStream("Demo1");
			ObjectInputStream oi=new ObjectInputStream(fi);
			obj2=(Demo1) oi.readObject();
			oi.close();
			System.out.println("Object2:"+obj2);
			System.out.println("Value 1 not serilized as it is transient:"+obj2.value());

		}catch(Exception e) {
			System.out.println("Exception during deserialization");
		}
		

	}

}
