package com.orangeandbronze.roman;

class RomanNumeralConverter {

	static StringBuilder sb;
	
	static final int ONES = 1;
	static final int TENS = 2;
	static final int HUNDREDS = 3;
	static final int THOUSANDS = 4;
	
	/** Converts an int into a Roman numeral String **/
	public static String convertToRomanNumeral(int number) {
		sb = new StringBuilder();
		int length = String.valueOf(number).length();
		switch (length) {
			case ONES:
				appendOnes(number);
				break;
				
			case TENS:
				appendTens(number);
				break;
				
			case HUNDREDS: 
				appendHundreds(number);
				break;
				
			case THOUSANDS:
				appendThousands(number);
				break;
				
			default: break;
		}
		
		return sb.toString();
	}

	/** will append string from left **/
	public static void appendOnes(int number) {
		if(number < 4) {
			for(int i = 0; i < number; i++) {
				sb.insert(0,"I");
			}
		} else if (number == 4) {
			sb.insert(0,"IV");
		} else if (number == 5) {
			sb.insert(0,"V");
		} else if (number > 5 && number < 9) {
			sb.insert(0,"V");
			for(int i = 5; i < number; i++) {
				sb.append("I");
			}
		} else if (number == 9) {
			sb.insert(0,"IX");
		} 
	}
	
	public static void appendTens(int number) {
		// ones digit (last digit)
		while(number/10 > 0) {
			int temp = number % 10;
			appendOnes(temp); // reuse code for ones digit
			number /= 10;
		}
		
		// tens digit
		if(number < 4) {
			for(int i = 0; i < number; i++) {
				sb.insert(0,"X");
			}
		} else if (number == 4) {
			sb.insert(0,"XL");
		} else if (number == 5) {
			sb.insert(0,"L");
		} else if (number > 5 && number < 9) {
			sb.insert(0,"L");
			for(int i = 5; i < number; i++) {
				sb.append("X");
			}
		} else if (number == 9) {
			sb.insert(0,"XC");
		} 
	}

	public static void appendHundreds(int number) {
		// extract the last two digits
		while(number/100 > 0) {
			int temp = number % 100;
			appendTens(temp); // reuse method for two-digit 
			number /= 100;
		}
		
		// tenth digit
		if(number < 4) {
			for(int i = 0; i < number; i++) {
				sb.insert(0,"C");
			}
		} else if (number == 4) {
			sb.insert(0,"CD");
		} else if (number == 5) {
			sb.insert(0,"D");
		} else if (number > 5 && number < 9) {
			sb.insert(0,"D");
			for(int i = 5; i < number; i++) {
				sb.append("C");
			}
		} else if (number == 9) {
			sb.insert(0,"CM");
		} 
	}

	public static void appendThousands(int number) {
		// extract the last three digits
		while(number/1000 > 0) {
			int temp = number % 1000;
			appendHundreds(temp); // reuse method for two-digit 
			number /= 1000;
		}
		
		// tenth digit
		if(number < 4) {
			for(int i = 0; i < number; i++) {
				sb.insert(0,"M");
			}
		} else if (number >= 4) {
			throw new UndefinedSymbolException("Undefined symbol if over 3999");
		} 
	}

	
}
