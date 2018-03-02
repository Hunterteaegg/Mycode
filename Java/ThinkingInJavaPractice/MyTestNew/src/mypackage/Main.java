package mypackage;

import java.util.Formatter;
import java.util.Scanner;

public class Main {
	public static Integer[] integer= {
			1,2,3,5,9,
	};
	public static Integer[] number()
	{
		return integer;
	}
	public static Integer returnNumber(int i)
	{
		return number()[i];
	}

	public static void main(String[] args){
		// TODO 自动生成的方法存根
		System.out.println("The number is "+returnNumber(3));
		
		
		

	}

}
