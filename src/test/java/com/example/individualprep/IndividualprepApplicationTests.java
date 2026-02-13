package com.example.individualprep;

import com.example.individualprep.service.ArithmeticUtility;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class IndividualprepApplicationTests {
	@Test
	void contextLoads() {
	}

	@Test
	void testArithmeticAdd() {
		ArithmeticUtility arithmeticUtility = new ArithmeticUtility();
		double result = arithmeticUtility.add(5.0, 3.0);
		assertEquals(8.0, result, 0.0001);
	}

}
