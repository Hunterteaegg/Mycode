package mypackage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		// TODO 自动生成的方法存根
		System.out.println("Enter a number:");
		Scanner scanner=new Scanner(System.in);
		int i=scanner.nextInt();
		scanner.close();
		System.out.println("The number is "+i);

	}

}
