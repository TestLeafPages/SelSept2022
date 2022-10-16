package week6.day2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnAssertions {

	@Test
	public void test() {
		String s = "TestLeaf";
		String s2 = "TestLe";
		String s3 = "Test";
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(s, s3);
		softAssert.assertEquals(s, s2);
		
//		Assert.assertEquals(s, s2);
//		Assert.assertTrue(s.contains(s2));
//		Assert.assertFalse(s.equals(s2));
		System.out.println("End of program");
		
		softAssert.assertAll();
	}
}
