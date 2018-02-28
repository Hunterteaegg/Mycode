package mypackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;   
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ArrayList<String> lecture=new ArrayList<String>();
		String temp;
		int line=0;
		Pattern pattern=Pattern.compile("we");
		
		try {     //use BufferedReader to speed
			BufferedReader reader=new BufferedReader(new FileReader("lecture.txt")); 
			
			try {
				while((temp=reader.readLine())!=null)
				{
					line++;
					
					if(pattern.matcher(temp).find())
					{
						System.out.println("On the line "+line);
					}
					lecture.add(temp);
				}
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
		System.out.println(lecture);
		Collections.reverse(lecture); //reverse list
		System.out.println(lecture);

	}

}
