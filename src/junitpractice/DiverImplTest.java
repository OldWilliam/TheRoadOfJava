package junitpractice;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DiverImplTest {
	Diver mDiver;
	@Before
	public void setUp() throws Exception {
		mDiver = new DiverImpl();
	}

	@After
	public void tearDown() throws Exception {
		mDiver = null;
	}

	@Test
	public void testReduce() {
		assertEquals(-1, mDiver.reduce(0, 1));
	}

}
