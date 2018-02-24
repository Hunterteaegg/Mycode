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
		// TODO 自动生成的方法存根
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1,1);
		System.out.println(list);
		System.out.println(list.get(1));
	}

}

class MyClass
{
	public void print()
	{
		System.out.println("Hello World!");
	}
}