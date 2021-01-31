package com.Sheet;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Validations {

	@Test
	public static void validate_1() {

		String actual = "gowtham";

		String expected = "karthi";

//	assertEquals(actual, expected);

//	assertNotEquals(actual, expected);

//	assertSame(actual, expected);

//	assertNull(actual);	

//	assertNotNull(actual);
		int age = 19;
		assertTrue(age >= 23);

//		assertFalse(age >= 23);

	}

}
