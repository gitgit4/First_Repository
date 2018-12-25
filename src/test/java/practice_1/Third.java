package practice_1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Third {
	
	@AfterTest
	public void a23er() {
		System.out.println("After Test---2");
	}
	
	@AfterTest
	public void a1() {
		System.out.println("After Test---1");
	}
	
	@Test (priority=3)
	public void getElement3() {
		System.out.println("third class");
		
		
	}
	
	

}
