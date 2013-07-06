package unitTestCases;
import classes.*;


import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class MathUnitTest 
{

	@Test
	public void testAdd() {
		addoperation ao = new addoperation();
		assertEquals(10, ao.Add(5, 5));
	}

	@Deprecated
	@Test
	public void testSubtract() {
		addoperation ao = new addoperation();
		assertEquals(1, ao.Subtract(5, 4));
	}

	@Test
	public void testMul() {
		addoperation ao = new addoperation();
		assertEquals(25, ao.mul(5, 5));
	}

	@Ignore
	public void Message() {
		System.out.println("This is print message");

	}

}
