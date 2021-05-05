/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.bridgelabz.findmaximum;

import java.util.Scanner;

public class FindMaximum {

	public static void main(String[] args) {
		new FindMaximum().findMax(20,5, 10);
		new FindMaximum().findMax(20.5f, 15.6f, 18.9f);
		new FindMaximum().findMax("Apple", "Peach", "Banana");
	}

	public static <E extends Comparable<E>> E findMax(E firstvalue, E secondvalue, E thirdvalue) {
		E max = firstvalue;
		if (secondvalue.compareTo(max) > 0) {
			max = secondvalue;
		}
		if (thirdvalue.compareTo(max) > 0) {
			max = thirdvalue;
		}
		printMax(max);
		return max;
	}
	
	public static <E> void printMax(E max)
	{
		System.out.println("Maximum Value is : "+max);
	}
}
