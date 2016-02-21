package cse360assign3;

/**
 * Class to create a simple calculator with a permanent
 *       history of all calculations performed
 * 
 * @author Lloyd Allen PIN 106 for CSE360 Spring 2016
 *
 * @version Feb 20, 2016
 * 
 */

public class Calculator {

	private int total;
	private String history;

	/**
	 * Creates a calculator, total is zero by default
	 * 
	 * @param none
	 */

	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}

	/**
	 * getTotal - returns the current total
	 * 
	 * @param none
	 * 
	 * @return total
	 */

	public int getTotal () {
		return total;
	}

	/**
	 * add - add a value to the total,
	 *       updates history
	 * 
	 * @param value	value to add
	 */

	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}

	/**
	 * subtract - subtract a value from the total,
	 *            updates history
	 * 
	 * @param value	value to subtract
	 */

	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}

	/**
	 * multiply - multiply a value with the total,
	 *            updates history
	 * 
	 * @param value	value to multiply
	 */

	public void multiply (int value) {
		total = total * value;
		history = history + " * " + value;
	}

	/**
	 * divide - integer divide a value into the total,
	 *                 if value is 0, total becomes 0,
	 *                 updates history
	 * 
	 * @param value	value to divide
	 */

	public void divide (int value) {

		if (value == 0)
			total = 0;
		else
			total = total / value;

		history = history + " / " + value;
	}

	/**
	 * getHistory - returns a String that contains a history
	 *              of all recent calculations completed
	 * 
	 * @param none
	 * 
	 * @return string containing all values and operations
	 *                used to compute the current total
	 */

	public String getHistory () {
		return history;
	}
}
