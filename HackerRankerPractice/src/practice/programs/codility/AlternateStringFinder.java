package practice.programs.codility;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Mohd Sardar
 *
 */
public class AlternateStringFinder {	
	// Get the number of deletions to get the only alternate series.

	public static void main(String[] args) {
		String s = "ABABABAB".concat("$");
		int deleteCounter = 0 ;
		int i =0;
		do {
			if (s.charAt(i) == s.charAt(i + 1))
				deleteCounter = deleteCounter + 1;
			i++;
		} while (s.charAt(i) != '$');		
		System.out.println(deleteCounter);
	}
}
