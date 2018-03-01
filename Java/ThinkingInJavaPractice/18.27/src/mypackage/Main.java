package mypackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {
		// TODO 自动生成的方法存根
		/*
		 * write an object in Data.txt
		 */
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("Data.txt"));
		out.writeObject(new ClassOne());
		out.close();
		
		/*
		 * read an object to Data.txt
		 */
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("Data.txt"));
		ClassOne one=(ClassOne)in.readObject();
		in.close();
		System.out.println(one.classTwo);

	}

}
