package com.TDD.calculator;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	void test() {
		Calculator calculator = new Calculator();
		int result = calculator.add("1,-1\n2\n-4,-7");
		assertEquals(2,result);
	}

}
