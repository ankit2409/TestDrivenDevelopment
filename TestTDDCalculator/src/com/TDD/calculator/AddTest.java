package com.TDD.calculator;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	void test() {
		Calculator calculator = new Calculator();
		int result = calculator.add("1,\n2\n1001");
		assertEquals(3,result);
	}

}
