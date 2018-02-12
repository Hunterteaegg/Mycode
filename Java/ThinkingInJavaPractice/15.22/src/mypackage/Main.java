package mypackage;

public class Main {

	public static void main(String[] args) throws InstantiationException, ReflectiveOperationException {
		// TODO 自动生成的方法存根
		System.out.println(new Reflex<MyClass>().create());

	}

}

class MyClass
{
	public String toString()
	{
		return "MyClass()";
	}
}

class Reflex<T>
{
	private T x;
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	T create() throws InstantiationException, ReflectiveOperationException
	{
		return (T) x.getClass().newInstance();
	}
}