package mypackage;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
		// TODO �Զ����ɵĹ��캯�����
		this.i=i;
	}
	
	public boolean equals(Object e)
	{
		MyClass temp=(MyClass)e;
		
		return (temp.i==i);
	}
}