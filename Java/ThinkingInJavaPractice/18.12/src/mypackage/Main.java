package mypackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ArrayList<String> lecture=new ArrayList<String>();
		String temp;
		
		try {     //use BufferedReader to speed
			BufferedReader reader=new BufferedReader(new FileReader("lecture.txt")); 
			PrintWriter out=new PrintWriter("lecture_out.txt");
			
			try {
				while((temp=reader.readLine())!=null)
				{
					lecture.add(temp);
				}
				for(String s:lecture)
				{
					out.println("Line "+lecture.indexOf(s)+":"+s);
				}
				reader.close();
				reader=new BufferedReader(new FileReader("lecture_out.txt"));
				while((temp=reader.readLine())!=null)
				{
					System.out.println(temp);
				}
				out.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		/*
		 * print result
		 */

	}

}
