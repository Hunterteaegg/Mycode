package mypackage;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(new MyClass("Hunterteaegg\n 25 8888 3.465 3687.9000"));

	}

}

class MyClass
{
	int age;
	long myfavortenum;
	float num1;
	double num2;
	String s;
	
	public MyClass(String info) {
		// TODO 自动生成的构造函数存根
		Scanner scanner=new Scanner(info);
		this.s=scanner.nextLine();
		this.age=scanner.nextInt();
		this.myfavortenum=scanner.nextLong();
		this.num1=scanner.nextFloat();
		this.num2=scanner.nextDouble();
		scanner.close();
	}
	
	public String toString() {
		return (s+" "+myfavortenum+" "+num1+" "+num2+" "+age);
	}
	
}