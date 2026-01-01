package problemsOnArrays.easy;

/**
 * Longest Sub array with given Sum K
 */
public class Question13 {
	public static void main(String[] args) {
		int[] arr = { 2,3,5 };
		int k = 5;

		int len = arr.length;
		int maxSum = 0;

		for (int i = 0; i < len; i++) {
			int range = len - i - 1;
			int endIndex = i;
			int sum = sum(endIndex, range, arr, k);
			maxSum = sum > maxSum ? sum : maxSum;
		}
		System.out.println(maxSum);
	}

	public static int sum(int endIndex, int range, int[] arr, int k) {
		int count = 0;
		for (int i = 0; i <= endIndex; i++) {
			for (int j = i; j <= range + i; j++) {
				count += arr[j];
			}
			if (count == k) {
				return range+1;
			}
			count = 0;
		}
		return 0;
	}
}
