package problemsOnArrays.easy;
/**
 * Find the Union of two arrays
 */
public class Question9 {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };

		int maxLength = arr1.length + arr2.length;
		int res[] = new int[maxLength];

		for (int i = 0, j = 0; i < arr1.length && j < arr2.length; i++,j++) {
			
		}

		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}

	}

	public static boolean isPresent(int[] arr, int n) {
		for (int i = 0; arr[i] != 0; i++) {
			if (arr[i] == n)
				return true;
		}
		return false;
	}

}
