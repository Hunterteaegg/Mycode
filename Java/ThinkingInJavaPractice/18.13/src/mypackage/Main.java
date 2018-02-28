package mypackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList<String> lecture=new ArrayList<String>();
		String temp;
		
		try {
			LineNumberReader in=new LineNumberReader(new FileReader("lecture.txt"));
			
			try {
				while((temp=in.readLine())!=null)
				{
					System.out.println("Line "+in.getLineNumber()+":"+temp);
				}
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		

	}

}
