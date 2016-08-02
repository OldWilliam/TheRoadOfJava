package junitpractice;


import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;
import junit.framework.TestSuite;

public class MathTestSuite {
	public static Test suite(){
		TestSuite suite = new TestSuite("junitpractice");
		
		suite.addTest(new JUnit4TestAdapter(AdderImplTest.class));
		suite.addTest(new JUnit4TestAdapter(DiverImplTest.class));
		return suite;
	}
}
