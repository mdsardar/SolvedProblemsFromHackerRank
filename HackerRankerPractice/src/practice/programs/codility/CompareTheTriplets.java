package practice.programs.codility;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mohd Sardar
 *
 */
public class CompareTheTriplets {
	// Decide the scores of the Alias & Bob's from the 
	// give 3D Array and retutn a 2D. 
	// Eg, [2,2,1]
	// [3,2,0] ==> O/P Array will be [1,1]
	
	public static void main(String[] args) {
		
		List<Integer> a = new ArrayList<>();
		List<Integer> resultList = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		a.add(2);
		a.add(2);
		a.add(2);
		
		b.add(2);
		b.add(2);
		b.add(2);
		
		resultList = compareTriplets(a,b);
		//System.out.println(resultList);
	}
	
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> resultList = new ArrayList<>();
		resultList.add(0,0);
		resultList.add(1,0);
		
		for (int c = 0; c < a.size(); c++) {
			if (a.get(c) > b.get(c)) {
				resultList.set(0, (resultList.get(0) + 1));
			} else if (a.get(c) < b.get(c)) {
				resultList.set(1,(resultList.get(1) + 1));
			}
		}
		return resultList;
	}
}
