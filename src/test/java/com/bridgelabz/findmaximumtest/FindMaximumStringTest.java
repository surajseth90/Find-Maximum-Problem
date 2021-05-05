package com.bridgelabz.findmaximumtest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.findmaximum.FindMaximum;

import static org.junit.Assert.*;

import org.junit.Assert;

public class FindMaximumStringTest {
	@Test
	public void givenFirstString_whenMax_shouldReturnTrue() {
		String max ="Peach";
		Assert.assertEquals(max,FindMaximum.findMaxString("Peach", "Apple", "Banana") );
	}
	@Test
	public void givenSecondString_whenMax_shouldReturnTrue() {
		String max ="Peach";
		Assert.assertEquals(max,FindMaximum.findMaxString("Apple", "Peach", "Banana") );
	}
	@Test
	public void givenThirdString_whenMax_shouldReturnTrue() {
		String max ="Peach";
		Assert.assertEquals(max,FindMaximum.findMaxString("Apple", "Banana", "Peach") );
	}
}
