package controller;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class MySecondTestClass {

	@Test
	public void testAppendageNull() {
		assertNull("Hello", null);
	}

	@Test
	public void testAppendageFalse() {
		assertFalse("Hello", false);
	}
}
