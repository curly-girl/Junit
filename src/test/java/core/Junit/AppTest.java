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
		assertEquals("String not the same","Testing JUnit 4", App.s);
	}
	@Test
	public void test_02_assertEquals_Negative() {
		assertEquals("String not the same","Testing TestNG 6", App.s);
		}
	@Ignore
	@Test
	public void test_03_assertEquals_Ignored() {
		assertEquals("String not the same","Testing JUnit 3", App.s);
		}
	@Test
	public void test_04_assertSame_Positive() {
		assertSame("Integer not the same",55, App.i);
		}
	
	@Test
	public void test_05_assertSame_Negative() {
		assertSame("Integer not the same",54, App.i);
		}
	@Ignore
	@Test
	public void test_06_assertSame_Ignored() {
		assertSame("Integer not the same",56,App.i);
	}
	@Test
	public void test_07_assertFalse_Positive() {
		assertFalse("Boolean should be false",App.f);
	}
	@Test
	public void test_08_assertFalse_Negative() {
		assertFalse("Boolean should be false",App.t);
	}
	@Test
	public void test_09_assertTrue_Positive() {
		assertTrue("Boolean should be true",App.t);
	}
	@Test
	public void test_10_assertFalse_Positive() {
		assertTrue("Boolean should be true",App.f);
	}

}
