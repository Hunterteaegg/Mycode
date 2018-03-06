package mypackage;

import net.mindview.atunit.TestProperty;

public class MyClass {

	private int print()
	{
		System.out.println("Hello World!");
		
		return 2;
	}
	@TestProperty
	int testPrint()
	{
		return print();
	}
}
