package mypackage;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SimpleHashMap<MyClass, Integer> map=new SimpleHashMap<MyClass,Integer>();
		
		map.put(new MyClass(), 1);
		map.put(new MyClass(), 2);
		map.put(new MyClass(), 2);

	}

}

class MyClass
{
	private static int i=0;
	
	@Override
	public int hashCode()
	{
		return 5;
		
	}
	public String toString()
	{
		i++;
		
		return "MyClass "+i;
	}
}