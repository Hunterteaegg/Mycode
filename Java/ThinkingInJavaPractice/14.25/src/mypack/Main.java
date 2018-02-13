package mypack;

import java.lang.reflect.Method;

import mypackage.MyClass;

public class Main {
	public static void expose(Object a,String methodname) throws Throwable, SecurityException
	{
		Method g=a.getClass().getDeclaredMethod(methodname);
		g.setAccessible(true);
		g.invoke(a);
	}

	public static void main(String[] args) throws RuntimeException, Throwable {
		// TODO �Զ����ɵķ������
		MyClass myClass=new MyClass();
		
		expose(myClass, "protectedmethod");
		expose(myClass, "privatemethod");

	}

}
