/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.bridgelabz.findmaximum;

import java.util.Scanner;

public class FindMaximum {

	public static void main(String[] args) {
		Integer firstNumber ;
		Integer secondNumber ;
		Integer thirdNumber ;
		new FindMaximum().findMax(20,5, 10);

	}

	public static Integer findMax(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
		Integer max = firstNumber;
		if (secondNumber.compareTo(max) > 0) {
			max = secondNumber;
		}
		if (thirdNumber.compareTo(max) > 0) {
			max = thirdNumber;
		}
		printMax(max);
		return max;
	}
	
	public static void printMax(Integer max)
	{
		System.out.println("Maximum number is : "+max);
	}

}
