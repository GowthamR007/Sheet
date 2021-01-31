package com.Sheet;

import org.testng.annotations.Test;

public class Expected_Exception {

	@Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
	public static void array_Datas() {
		int a[] = new int[2];

		a[0] = 10;
		a[1] = 20;

		System.out.println(a[10]);
	}
}
