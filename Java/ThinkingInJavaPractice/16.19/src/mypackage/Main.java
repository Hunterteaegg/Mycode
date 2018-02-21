package mypackage;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		MyClass[] array1=new MyClass[5];
		MyClass[] array2=new MyClass[5];
		
		Arrays.fill(array1, new MyClass(5));
		Arrays.fill(array2, new MyClass(5));
		System.out.println(Arrays.equals(array1, array2));

	}

}

class MyClass
{
	protected int i;
	
	public MyClass(int i) {
		// TODO 自动生成的构造函数存根
		this.i=i;
	}
	
	public boolean equals(Object e)
	{
		MyClass temp=(MyClass)e;
		
		return (temp.i==i);
	}
}