package practice.programs.codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class MinDistance {
	
	// Get the very minimum distance between the same pair of elements.
	
	public static void main(String[] args) {
		Integer[] indicesArray = { 3,2,1,2,3 };
		System.out.println("The MIN distance is: " + getMinDistance(indicesArray));		
	}

	private static int getMinDistance(Integer[] calc) {
		int minDistance = -1;
		for (int a = 0; a <= calc.length - 1; a++) {
			for (int b = a + 1; b < calc.length; b++) {
				if (calc[a] == calc[b])
					if (minDistance > b - a || minDistance == -1)
						minDistance = (b - a);
			}
		}
		return minDistance;
	}
}

	/* TEST DATA
	   1 > -1, 3, 3,5, 3, 5, -1, -1 
	   2 > -1, 3, 3,5, 3, 5,
 	   3 > -1,0,1,2-1,1,1
	   4 >  1, 1, 1, 1, 1,-1,2,2,-1,3,7,3 1, 3,2, 1 // 5, 3, 7, 10, 5
	 */
