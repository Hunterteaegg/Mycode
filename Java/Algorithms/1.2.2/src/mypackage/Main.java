package mypackage;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;

import edu.princeton.cs.algs4.Interval1D;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		DataInputStream input=new DataInputStream(new BufferedInputStream(System.in));
		ArrayList<Interval1D> list=new ArrayList<Interval1D>();
		int temp=0;
		
		//ask the number
		System.out.println("Enter a number:");
		temp=input.readInt();
		
		//add elements
		System.out.println("Enter "+temp+" number");
		if(input.available()!=0)
		{
			;
		}
		
		//print the list
		System.out.println(list);

	}

}
