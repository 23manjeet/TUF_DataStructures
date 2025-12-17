package problemsOnArrays.easy;

/**
 * Question 1: Find largest element in a given array
 */
public class Question1 {

	public static void main(String[] args) {
		int arr[] = { 8, 10, 5, 7, 9 };
		int min = Integer.MIN_VALUE;
		for (int i : arr) {
			if(i>min)
				min = i;
		}
		System.out.println(min);
	}

}
