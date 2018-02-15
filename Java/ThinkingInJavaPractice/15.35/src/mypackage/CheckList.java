package mypackage;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CheckList {
	

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List<Coffee> checklist=Collections.checkedList(new LinkedList<Coffee>(), Coffee.class);
		try
		{
			checklist.add(new A());
			checklist.add(new Coffee());
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		for(Coffee c:checklist)
		{
			System.out.println(c);
		}

	}

}

class A extends Coffee
{
	;
}