package com.sunilbooks.selflearnjava.controlstatement;

/**
 * Break statement is used to terminate a WHILE loop
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class WhileWithBreak {

	public static void main(String[] args) {

		// Declare local variable i
		int i = 0;
		boolean flag = true;

		while (flag) {
			// Break the look of i is equal to 5
			if (i == 5) {
				break;
			}
			System.out.println(i + "Hello While loop");
			i++;
		}
	}

}
