package practice.hackerRank.Algorithms;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MinMaxSum {
	public static void main(String[] args) {
		int[] a = { 769082435, 210437958, 673982045, 375809214, 380564127 };		
		anotherMiniMaxSum(a);
		Arrays.sort(a);
		long minSum = 0, maxSum = 0, sum;

		for (int x = 0; x < a.length; x++) {
			sum = 0;
			for (int y = 0; y < a.length; y++) {
				if (x != y) {
					sum = sum + a[y];
				}
				minSum = Long.min(sum, maxSum);
				maxSum = Long.max(maxSum, sum);
			}
			System.out.println("Sum:# " + sum);
		}
		System.out.println("Min:# " + minSum + " Max:# " + maxSum);
	}
	
	// One Another approach to get MIN & MAX sums.
	private static void anotherMiniMaxSum(int[] inArr){
		long sum = 0; 
		for (int x = 0; x < inArr.length; x++) {
			sum += inArr[x];
		}
		Arrays.sort(inArr);
		Arrays.stream(inArr).forEach(System.out::println);

		System.out.println("Max Sum: " + (sum - inArr[0]) + " Min Sum: " + (sum - inArr[inArr.length - 1]));
		
	}
}


//TEST DATA
/************
// I/P : 769082435, 210437958, 673982045, 375809214, 380564127
// O/P 1640793344 2199437821
// 1,3,5,7,9 // 9,4,3,1,5 13 */
