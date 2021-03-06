package sample;

import org.junit.Assert;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	//	public AppTest( String testName ) {
	//		super( testName );
	//	}

	/**
	 * @return the suite of tests being tested
	 */
	//	public static Test suite() {
	//		return new TestSuite( AppTest.class );
	//	}

	/**
	 * Rigourous Test :-)
	 */
	//	public void testApp() {
	//		assertTrue( true );
	//	}

	private String INPUT = "123456";

	@org.junit.Test
	public void testLength() {
		Assert.assertEquals(64, App.sha256hex(INPUT).length());
	}

	@org.junit.Test
	public void testHex() {
		String expected = "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92";
		Assert.assertEquals(expected, App.sha256hex(INPUT));
	}

}
