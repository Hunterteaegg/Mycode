package mypackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		String temp;
		
		try {
			while((temp=stdin.readLine())!=null&&temp.length()!=0)
			{
				System.out.println(temp.toUpperCase());
			}
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}

}
