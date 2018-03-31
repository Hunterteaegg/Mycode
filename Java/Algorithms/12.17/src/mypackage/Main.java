package mypackage;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Rational num1=new Rational(5, 3);
		Rational num2=new Rational(3, 5);
		System.out.println(num1);
		System.out.println(num2);
		
		num1.plus(num2);
		System.out.println(num1);
		assert Double.parseDouble(num1.toString())<0:"Nice Number";
		

	}

}
