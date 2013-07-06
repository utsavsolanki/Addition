package testSuit;

import org.junit.runners.Suite;
import org.junit.runner.RunWith;

import org.junit.runners.Suite.SuiteClasses;

import unitTestCases.Alert;
import unitTestCases.CountLink;
import unitTestCases.MathUnitTest;
import unitTestCases.popupWindow;

@RunWith(Suite.class)
@SuiteClasses( { MathUnitTest.class,CountLink.class,Alert.class,popupWindow.class })
public class AllTests {

}
