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

	//Tests that history initializes correctly
	@Test
	public void testGetHistory() {

		Calculator testCalc = new Calculator();

		assertEquals("0", testCalc.getHistory());
	}

	//Tests that history works correctly after
	//several operations
	@Test
	public void testGetHistoryMultiple() {

		Calculator testCalc = new Calculator();

		testCalc.add(4); 
		testCalc.subtract(2); 
		testCalc.multiply(2); 
		testCalc.divide(5); 

		assertEquals("0 + 4 - 2 * 2 / 5", testCalc.getHistory());
	}

	//Tests that history works correctly after
	//many operations, including a divide by zero
	@Test
	public void testGetHistoryLong() {

		Calculator testCalc = new Calculator();

		testCalc.add(10);
		testCalc.subtract(2);
		testCalc.multiply(4);
		testCalc.divide(0);
		testCalc.add(1);
		testCalc.multiply(50);
		testCalc.subtract(0);
		testCalc.multiply(3);
		testCalc.divide(4);
		testCalc.multiply(13);

		assertEquals("0 + 10 - 2 * 4 / 0 + 1 * 50 - 0 * 3 / 4 * 13",
				     testCalc.getHistory());
	}

	//Tests that calculator works correctly after
	//several operations
	@Test
	public void testGetTotalMultiple() {

		Calculator testCalc = new Calculator();

		testCalc.add(4);
		testCalc.subtract(2);
		testCalc.multiply(2);
		testCalc.divide(4);

		assertEquals(1, testCalc.getTotal());
	}

	//Tests that calculator works correctly after
	//several operations, including a divide by zero
	@Test
	public void testGetTotalMultipleDivideZero() {

		Calculator testCalc = new Calculator();

		testCalc.add(10);
		testCalc.subtract(2);
		testCalc.multiply(4);
		testCalc.divide(0);
		testCalc.add(4);
		testCalc.multiply(5);

		assertEquals(20, testCalc.getTotal());
	}
}