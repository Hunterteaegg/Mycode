package mypackage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

@SuppressWarnings("serial")
class HastMapTest extends HashMap<Integer, String> {

	@Test
	void testIsEmpty() {
		assert super.isEmpty();
	}

	@Test
	void testContainsKey() {
		super.put(1, "Go");
		
		assert super.containsKey(1);
	}

}
