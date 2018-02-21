package mypackage;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		MyClass[] array1=new MyClass[5];
		MyClass[] array2=new MyClass[5];
		
		Arrays.fill(array1, new MyClass(5));
		Arrays.fill(array2, new MyClass(5));
		System.out.println(Arrays.equals(array1, array2));
		Arrays.sort(array1,new MyClassComparator());
		System.out.println(Arrays.binarySearch(array1, new MyClass(5),new MyClassComparator()));

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

class MyClassComparator implements Comparator<MyClass>
{

	@Override
	public int compare(MyClass arg0, MyClass arg1) {
		// TODO �Զ����ɵķ������
		return arg0.i>arg1.i?1:(arg0.i==arg1.i)?0:-1;
	}
	
}