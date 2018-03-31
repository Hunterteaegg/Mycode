package mypackage;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		DataInputStream input=new DataInputStream(new BufferedInputStream(System.in));
		
		System.out.println("Enter a string:");
		String temp1=input.readLine();
		System.out.println("Enter another string:");
		String temp2=input.readLine();
		System.out.println(temp1+" "+temp2);
		

	}

}
