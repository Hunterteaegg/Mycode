package mypackage;

public class Main {
	@SuppressWarnings("rawtypes")
	static void checksuperclass(Object item)
	{
		Class c=item.getClass();  //get item's class information
		
		while(!c.getSimpleName().equals("Object"))    //set condition: if not Object, continue
		{
			System.out.println(c.getDeclaredFields());
			c=c.getSuperclass();
		}
		
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Object object=new MyClass2();   //can replace of any object
		
		checksuperclass(object);

	}

}

class MyClass
{
	int i=0;
}

class MyClass2 extends MyClass
{
	int j=1;
}