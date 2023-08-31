package controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import contoller.StringAppendage;

public class MyFirstTestClass {
	StringAppendage stringApp = new StringAppendage();

	@Test
	public void testAppendage() {
		assertEquals("Tate love's java", stringApp.append("Tate ", "love's java"));
	}

	@Test
	public void testAppendageFail() {
		assertNotEquals("Tate hates java", stringApp.append("Tate ", "love's java"));
	}
}
