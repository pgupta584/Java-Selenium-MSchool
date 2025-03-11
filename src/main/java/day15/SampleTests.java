package day15;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ExtentTestListners.class)
public class SampleTests {
	
	@Test
	public void test1() {
		System.out.println("Test1");
		
	}
	
	@Test
	public void test2() {
//		Assert.assertEquals(1, 2);
		System.out.println("Test2");


	}
	
	@Test
	public void test3() {
		System.out.println("Test3");

		
	}

}
