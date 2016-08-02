package junitpractice;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AdderImplTest {
	Adder mAdder;
	@Before
	public void setUp() throws Exception {
		mAdder = new AdderImpl();
	}

	@After
	public void tearDown() throws Exception {
		mAdder = null;

	}
	@Test
	public void  testAdd() {
		assertEquals(0, mAdder.add(0, 0));
		assertEquals(1, mAdder.add(1, 0));
		assertEquals(2, mAdder.add(1, 1));
		assertEquals(0, mAdder.add(1, -1));
		assertEquals(Integer.MAX_VALUE+1, mAdder.add(1, Integer.MAX_VALUE));
		assertEquals(Integer.MIN_VALUE-1, mAdder.add(-1, Integer.MIN_VALUE));
	}

}
