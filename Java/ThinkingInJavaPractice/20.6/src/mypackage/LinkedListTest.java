package mypackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

	LinkedListObject testObject=new LinkedListObject();
	@Test
	public void testContains() {
		testObject.add("one");
		
		assert testObject.contains("one");
	}

	@Test
	public void testAddE() {
		testObject.add("One");
		
		assert testObject.contains("One");
	}

	@Test
	public void testRemoveInt() {
		testObject.add("two");
		testObject.remove("two");
		
		assert testObject.isEmpty();
	}

}
