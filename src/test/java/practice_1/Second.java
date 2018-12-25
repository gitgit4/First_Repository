package practice_1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Second {
	
	@BeforeTest
	public void b1() {
		System.out.println("Before Test");
	}
	
	@Test (priority=2)
	public void getElement2() {
		System.out.println("second class");
	}
	
	

}
