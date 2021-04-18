package com.rkiesling.mvnecho.test;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestClass extends TestCase {
    private static final String s = "mvnecho test case";
    @Test
    public void testEcho () {
	System.out.println (s);
	assertEquals (s, "mvnecho test case");
    }
}
