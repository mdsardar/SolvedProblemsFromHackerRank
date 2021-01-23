package practice.programs.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Mohd Sardar
 *
 */
public class RightShiftArray {
	
	// Right Shift the elements the number of times, 
	// Target to place the last element at the starting position of array. 

	public static void main(String[] args) {
		int[] actualArray = {}; // 2456 // 6245
		int n = 4;
		if (actualArray.length <= 0)
			System.out.println("Array is empty");
		else
			actualArray = shiftingArray(actualArray, n);

		/*
		 * IntStream afterShift = Arrays.stream(actualArray);
		 * afterShift.forEach(System.out::println);
		 */
	}

	static int[] shiftingArray(int[] convertToArray, int n) {
		for (int i = 1; i <= n; i++) {
			int tempShifting[] = new int[convertToArray.length];
			int converArrLen = convertToArray.length - 1;
			for (int j = 0; j <= converArrLen; j++) {
				if (j < converArrLen)
					tempShifting[j + 1] = convertToArray[j];
			}
			tempShifting[tempShifting.length - tempShifting.length] = convertToArray[converArrLen];
			convertToArray = tempShifting;
		}
		return convertToArray;
	}
}
