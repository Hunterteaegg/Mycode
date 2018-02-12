package mypackage;

public class Main {
	static <T extends Base1> void test1(T x)
	{
		x.print1();
	}
	static <U extends Base2> void test2(U y)
	{
		y.print2();
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		test1(new MyClass());
		test2(new MyClass());

	}

}

interface Base1
{
	void print1();
}

interface Base2
{
	void print2();
}

class MyClass implements Base1,Base2
{
	@Override
	public void print1()
	{
		System.out.println("print1");
	}
	@Override
	public void print2()
	{
		System.out.println("print2");
	}
}

