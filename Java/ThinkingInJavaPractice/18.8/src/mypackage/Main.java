package mypackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;   
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList<String> lecture=new ArrayList<String>();
		String temp;
		
		try {     //use BufferedReader to speed
			BufferedReader reader=new BufferedReader(new FileReader("lecture.txt")); 
			
			try {
				while((temp=reader.readLine())!=null)
				{
					lecture.add(temp.toUpperCase());
				}
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		/*
		 * print result
		 */
		System.out.println(lecture);
		Collections.reverse(lecture); //reverse list
		System.out.println(lecture);

	}

}
