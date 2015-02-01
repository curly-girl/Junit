package core.Junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;

public class AppTest {

	@BeforeClass
	public static void BeforeClass() throws Exception {
	}

	@AfterClass
	public static void AfterClass() throws Exception {
	}

	@Before
	public void Before() throws Exception {
	}

	@After
	public void After() throws Exception {
	}

	@Test
	public void test_01_assertEquals_Positive() {
		System.out.println("Test_01_assertEquals_Positive");
		String ok="yes";
		assertEquals("Test fail","yes",ok);
	}
	@Test
	public void test_02_assertEquals_Negative() {
		System.out.println("Test_02_assertEquals_Negative");
		String ok="yes";
		assertEquals("Test fail","no",ok);
	}
	@Ignore
	@Test
	public void test_03_assertEquals_Ignored() {
		System.out.println("Test_03_assertEquals_Ignored");
		String ok="yes";
		assertEquals("Test fail","yes",ok);
	}
	@Test
	public void test_04_assertSame_Positive() {
		System.out.println("Test_04_assertSame_Positive");
		Integer i=19;
		assertSame("Test fail",i,19);
	}
	@Test
	public void test_05_assertSame_Negative() {
		System.out.println("Test_05_assertSame_Negative");
		Integer i=9;
		assertSame("Test fail",i,19);
	}
	@Ignore
	@Test
	public void test_06_assertSame_Positive() {
		System.out.println("Test_06_assertSame_Positive");
		Integer i=19;
		assertSame("Test fail",i,19);
	}
	@Test
	public void test_07_assertFalse_Positive() {
		System.out.println("Test_07_assertFalse_Positive");
		Boolean f=false;
		assertFalse("Test fail",f);
	}
	@Test
	public void test_08_assertFalse_Negative() {
		System.out.println("Test_08_assertFalse_Negative");
		Boolean f=true;
		assertFalse("Test fail",f);
	}
	@Test
	public void test_09_assertTrue_Negative() {
		System.out.println("Test_10_assertTrue_Negative");
		Boolean t=true;
		assertFalse("Test fail",t);
	}
	@Test
	public void test_10_assertFalse_Positive() {
		System.out.println("Test_08_assertFalse_Positive");
		Boolean t=false;
		assertFalse("Test fail",t);
	}

}
