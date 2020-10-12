package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.JoshuaVanBaalen.LabA.Calculate;

class Tests {
		
	Calculate calc;
		
	@BeforeEach
	void init(){
			calc = new Calculate();
		}
		
	@Test
	void addTest() {
		int expected = 4;
		int actual = calc.add(3, 1);
		assertEquals(actual, expected);
	}
	
	@Test
	void subTest(){
		assertEquals(calc.subtract(10, 5), 5, "Expected 5");
	}
	
	@Test
	void multTest() {
		assertEquals(calc.multiply(5, 5), 25, "Expected 25");
	}
}

