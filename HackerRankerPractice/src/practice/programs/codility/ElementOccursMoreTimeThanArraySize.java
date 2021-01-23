package practice.programs.codility;

import java.util.*;	

/**
 * @author Mohd Sardar
 *
 */
public class ElementOccursMoreTimeThanArraySize {
	// The element which has occured more than half of the array's length size
	// One of the demo program
	
	public static void main(String[] args) {
		int[] s = { 1, 1, 50, 50, 50, 50, 50, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
		System.out.println(solution(s));
	}

	static int solution(int[] A) {
		int n = A.length;
		int[] L = new int[n + 1];
		L[0] = -1;
		for (int i = 0; i < n; i++) {
			L[i + 1] = A[i];
		}

		int count = 0;
		int pos = (n + 1) / 2;
		int candidate = L[pos];

		for (int i = 1; i <= n; i++) {
			if (L[i] == candidate)
				count = count + 1;
		}

		if (count > pos)
			// if (2 * count > n)
			return candidate;

		return (-1);
	}
}
