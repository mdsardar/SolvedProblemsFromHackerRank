package practice.programs.codility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Mohd Sardar
 *
 */
public class BinaryPattern {
	
	// The count of longest 0 sequence in the binary forms. 

	public static void main(String[] rt) {
		System.out.println(binaryPattern(66561));
	}

	static int binaryPattern(int convertToBinary) {
		
		String convertedStr = Integer.toBinaryString(convertToBinary);
		
		System.out.println("Binary String: " + convertedStr);
				
		String regex = "10+1";
		
		// compiling regex
		Pattern p = Pattern.compile(regex);

		
		// Matcher object
		Matcher m = p.matcher(convertedStr);
		
		int maxBinaryDigit = 0;
		while (m.find()) {
			// As last character of current match
			// is always one, starting match from that index
			
			int binaryLen = m.group().length()-2;

			if (binaryLen > maxBinaryDigit ) {
				maxBinaryDigit = binaryLen;
			}

			System.out.println("The matcher is " + m.group());
			m.region(m.end() - 1, convertedStr.length());			
		}
		return maxBinaryDigit;
	}
}