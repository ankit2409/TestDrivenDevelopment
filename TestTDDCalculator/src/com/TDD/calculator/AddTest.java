package com.TDD.calculator;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	void test() {
		Calculator calculator = new Calculator();
		int result = calculator.add("8,9,1,2,4,2,3");
		assertEquals(29,result);
	}

}
