package mypackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import net.mindview.atunit.TestProperty;

public class MyClassTest extends MyClass {

	@Test
	public void testPrint2()
	{
		assert testPrint()==2;
	}

}
