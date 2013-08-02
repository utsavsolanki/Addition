package unitTestCases;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import classes.*;

public class MathUnitTest 
{

	@Test(priority=1)
	public void testAdd() {
		addoperation ao = new addoperation();
		AssertJUnit.assertEquals(10, ao.Add(5, 5));
	}


	@Test(priority=3)
	public void testSubtract() {
		addoperation ao = new addoperation();
		AssertJUnit.assertEquals(1, ao.Subtract(5, 4));
	}

	@Test(priority=2)
	public void testMul() {
		addoperation ao = new addoperation();
		AssertJUnit.assertEquals(25, ao.mul(5, 5));
	}

	@Test(enabled = false)
	public void Message() {
		System.out.println("This is print message");

	}
	
	

}
