/**
 * @author hunterteaegg
 */
package mypackage;

import java.util.LinkedList;

/**
 * @author HunterTeaEgg_HOME
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		File file=new File("https://www.baidu.com");
		for(String s:file.list())
		{
			System.out.println(s);
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