package com.orangeandbronze.roman;

import static org.junit.Assert.*;

import org.junit.Before;

import static com.orangeandbronze.roman.RomanNumeralConverter.*;

import org.junit.Test;

public class RomanNumeralTest {
	
	@Test
	public void convertToRomanNumeral_1() {
		assertEquals("I", convertToRomanNumeral(1));
	}
	
	@Test
	public void convertToRomanNumeral_2() {
		assertEquals("II", convertToRomanNumeral(2));
	}
	
	@Test
	public void convertToRomanNumeral_3() {
		assertEquals( "III", convertToRomanNumeral(3));
	}
	
	@Test
	public void convertToRomanNumeral_4() {
		assertEquals("IV", convertToRomanNumeral(4));
	}
	
	@Test
	public void convertToRomanNumeral_5() {
		assertEquals("V", convertToRomanNumeral(5));
	}
	
	@Test
	public void convertToRomanNumeral_6() {
		assertEquals("VI", convertToRomanNumeral(6));
	}
	
	@Test
	public void convertToRomanNumeral_8() {
		assertEquals("VIII", convertToRomanNumeral(8));
	}
	
	@Test
	public void convertToRomanNumeral_9() {
		assertEquals("IX", convertToRomanNumeral(9));
	}
	
	@Test
	public void convertToRomanNumeral_10() {
		assertEquals("X", convertToRomanNumeral(10));
	}
	
	@Test
	public void convertToRomanNumeral_14() {
		assertEquals("XIV", convertToRomanNumeral(14));
	}
	
	@Test
	public void convertToRomanNumeral_15() {
		assertEquals("XV", convertToRomanNumeral(15));
	}
	
	@Test
	public void convertToRomanNumeral_20() {
		assertEquals("XX", convertToRomanNumeral(20));
	}
	
	@Test
	public void convertToRomanNumeral_25() {
		assertEquals("XXV", convertToRomanNumeral(25));
	}
	
	@Test
	public void convertToRomanNumeral_34() {
		assertEquals("XXXIV", convertToRomanNumeral(34));
	}
	
	@Test
	public void convertToRomanNumeral_44() {
		assertEquals("XLIV", convertToRomanNumeral(44));
	}
	
	@Test
	public void convertToRomanNumeral_53() {
		assertEquals("LIII", convertToRomanNumeral(53));
	}
	
	@Test
	public void convertToRomanNumeral_55() {
		assertEquals("LV", convertToRomanNumeral(55));
	}
	
	@Test
	public void convertToRomanNumeral_95() {
		assertEquals("XCV", convertToRomanNumeral(95));
	}
	
	@Test
	public void convertToRomanNumeral_99() {
		assertEquals("XCIX", convertToRomanNumeral(99));
	}
	
	@Test 
	public void convertToRomanNumeral_125() {
		assertEquals("CXXV", convertToRomanNumeral(125));
	}
	
	@Test 
	public void convertToRomanNumeral_425() {
		assertEquals("CDXXV", convertToRomanNumeral(425));
	}
	
	@Test
	public void convertToRomanNumeral_500() {
		assertEquals("D", convertToRomanNumeral(500));
	}
	
	
	@Test
	public void convertToRomanNumeral_1000() {
		assertEquals("M", convertToRomanNumeral(1000));
	}
	
	@Test
	public void convertToRomanNumeral_3000() {
		assertEquals("MMM", convertToRomanNumeral(3000));
	}
	
	@Test(expected = UndefinedSymbolException.class)
	public void convertToRomanNumeral_Above4000() {
		for(int num = 4000; num <= 10000; num+=1000) {
			String y = convertToRomanNumeral(4000);
		}
	}
	
}
