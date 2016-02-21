package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	//Tests that the constructor creates an object
	@Test
	public void testCalculator() {

		Calculator testCalc = new Calculator();

		assertNotNull(testCalc);
	}

	//Tests that the getTotal returns the total
	@Test
	public void testGetTotal() {

		Calculator testCalc = new Calculator();

		assertEquals(0,testCalc.getTotal());
	}

	//Tests that the calculator adds correctly
	@Test
	public void testAdd() {

		Calculator testCalc = new Calculator();

		testCalc.add(1);

		assertEquals(1,testCalc.getTotal());
	}

	//Tests that the calculator subtracts correctly
	@Test
	public void testSubtract() {

		Calculator testCalc = new Calculator();

		testCalc.subtract(3);

		assertEquals(-3,testCalc.getTotal());
	}

	//Tests that the calculator multiplies correctly
	//with an initial total of zero
	@Test
	public void testMultiplyZero() {

		Calculator testCalc = new Calculator();

		testCalc.multiply(1);

		assertEquals(0,testCalc.getTotal());
	}

	//Tests that the calculator multiplies correctly
	//with a total value of 1
	@Test
	public void testMultiply() {

		Calculator testCalc = new Calculator();

		testCalc.add(1); //Changes the total to 1
		testCalc.multiply(5);

		assertEquals(5,testCalc.getTotal());
	}

	//Tests that the calculator divides correctly
	//when the value is zero
	@Test
	public void testDivideZero() {

		Calculator testCalc = new Calculator();

		testCalc.add(1); //Changes the total to 1
		testCalc.divide(0);

		assertEquals(0,testCalc.getTotal());
	}

	//Tests that the calculator divides correctly
	//when the total is a multiple of the value
	@Test
	public void testDivideMultiple() {

		Calculator testCalc = new Calculator();

		testCalc.add(10); //Changes the total to 10
		testCalc.divide(5);

		assertEquals(2,testCalc.getTotal());
	}

	//Tests that the calculator divides correctly
	//when the value is not a multiple
	@Test
	public void testDivideNonMultiple() {

		Calculator testCalc = new Calculator();

		testCalc.add(4); //Changes the total to 4
		testCalc.divide(3);

		assertEquals(1,testCalc.getTotal());
	}

	//Tests that the calculator divides correctly
	//when the value is larger than the total
	@Test
	public void testDivideLarge() {

		Calculator testCalc = new Calculator();

		testCalc.add(4); //Changes the total to 4
		testCalc.divide(100);

		assertEquals(0,testCalc.getTotal());
	}

	@Test
	public void testGetHistory() {
		fail("Not yet implemented");
	}

}