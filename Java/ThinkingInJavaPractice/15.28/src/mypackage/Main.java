package mypackage;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Generic1<Test> generic1=new Generic1<Test>();
		generic1.test(new Test());
		
		Generic2<Test> generic2=new Generic2<Test>(new Test());
		generic2.test();

	}

}

class Generic1<T>
{
	void test(T x)
	{
		System.out.println("Generic1.test");
		System.out.println(x.getClass());
	}
}

class Generic2<T>
{
	private T x;
	
	public Generic2(T x) {
		// TODO 自动生成的构造函数存根
		this.x=x;
	}
	
	T test()
	{
		System.out.println("Generic2.test");
		
		return x;
	}
}

class Test
{
	public String toString()
	{
		return "MyTest "+this.getClass();
	}
}