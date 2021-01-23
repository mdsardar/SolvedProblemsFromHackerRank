package practice.programs.codility;

public class FizzBuzzProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fizzBuzz(15);
	}

	public static void fizzBuzz(int n) {
		for (int count = 1; count <= n; count++) {
			int real = 0;
			int realThree = count % 3;
			if (count % 3 == real && count % 5 == 0)
				System.out.println("FizzBuzz");
			else if (realThree == 0)
				System.out.println("Fizz");
			else if (count % 5 == real)
				System.out.println("Buzz");
			else
				System.out.println(count);
		}
	}

}
