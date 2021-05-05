package com.bridgelabz.findmaximumtest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.findmaximum.FindMaximum;

import static org.junit.Assert.*;

import org.junit.Assert;

public class FindMaximumFloatTest {
	@Test
	public void givenFirstFloat_whenMax_shouldReturnTrue() {
		Float max =20.0f;
		Assert.assertEquals(max,FindMaximum.max(20.0f, 10.5f, 5.9f) );
	}
	@Test
	public void givenSecondFloat_whenMax_shouldReturnTrue() {
		Float max =45.5f;
		Assert.assertEquals(max,FindMaximum.max(20.9f, 45.5f, 5.9f) );
	}
	@Test
	public void givenThirdFloat_whenMax_shouldReturnTrue() {
		Float max =50.8f;
		Assert.assertEquals(max,FindMaximum.max(20.6f, 10.9f, 50.8f) );
	}
}