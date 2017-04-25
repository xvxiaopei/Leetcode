package MySet;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMySet {

	@Test
	public void test1() {
		MySet<Integer> set = new MySet<Integer>(30);
		set.add(1);
		set.add(2);
		assertTrue(set.contains(1));
		assertTrue(set.contains(2));
		assertFalse(set.contains(3));
	}
	
	@Test
	public void test2() {
		MySet<String> set = new MySet<String>(30);
		set.add("XX");
		set.add("XY");
		assertTrue(set.contains("XY"));
		assertTrue(set.contains("XX"));
		assertFalse(set.contains("X"));
		assertEquals(set.Size(),2);
		
		set.add("XX");
		assertTrue(set.contains("XX"));
		assertEquals(set.Size(),2);
		
	}

}
