package day12;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestNgTest1 {
	
	@Test
	void testfn1() {
		System.out.println("TestNg Tests 1");
		
		assertEquals("1", "2", "Failed");
	}
	
	@Test
	void testfn2() {
		System.out.println("TestNg Tests 2");
		assertTrue(true);
	}
}
