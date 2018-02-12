package mypackage;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		MyClass2<MyClass1> myClass2=new MyClass2<MyClass1>(new MyClass1());
		myClass2.method();

	}

}

interface MyInterface
{
	void Method1();
	void Method2();
}

class MyClass1 implements MyInterface
{
	public void Method1()
	{
		System.out.println("MyClass1().Method1()");
	}
	public void Method2()
	{
		System.out.println("MyClass1().Method2()");
	}
	public void Method3()
	{
		System.out.println("MyClass1().Method3()");
	}
}

class MyClass2<T extends MyInterface>
{
	T obj;
	
	public MyClass2(T obj) {
		// TODO 自动生成的构造函数存根
		this.obj=obj;
	}
	
	void method()
	{
		obj.Method1();
		obj.Method2();
	}
}