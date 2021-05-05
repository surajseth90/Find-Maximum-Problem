package com.bridgelabz.findmaximumtest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.findmaximum.FindMaximum;

import static org.junit.Assert.*;

import org.junit.Assert;

public class FindMaximumIntegerTest {
	@Test
	public void givenFirstInteger_whenMax_shouldReturnTrue() {
		Integer max =20;
		Assert.assertEquals(max,FindMaximum.findMax(20, 10, 5) );
	}
	@Test
	public void givenSecondInteger_whenMax_shouldReturnTrue() {
		Integer max =45;
		Assert.assertEquals(max,FindMaximum.findMax(20, 45, 5) );
	}
	@Test
	public void givenThirdInteger_whenMax_shouldReturnTrue() {
		Integer max =50;
		Assert.assertEquals(max,FindMaximum.findMax(20, 10, 50) );
	}
}
