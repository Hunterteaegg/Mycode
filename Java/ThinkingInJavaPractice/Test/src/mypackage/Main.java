/**
 * @author hunterteaegg
 */
package mypackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author HunterTeaEgg_HOME
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Class c=MyClass.class;
		Method[] methods=c.getMethods();
		Constructor[] constructors=c.getConstructors();
		
		for(Method method:methods)
		{
			System.out.println(method);
		}
		System.out.println();
		for(Constructor constructor:constructors)
		{
			System.out.println(constructor);
		}

	}

}

class MyClass
{
	public void print()
	{
		System.out.println("Hello World!");
	}
}