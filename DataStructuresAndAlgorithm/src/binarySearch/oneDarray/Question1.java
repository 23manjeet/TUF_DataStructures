package binarySearch.oneDarray;

public class Question1 {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 6, 7, 9, 12, 16, 17 };

		int target = 9;

		int index = binarySearch(arr, 0, arr.length - 1, target);

		System.out.println(index);

	}

	private static int binarySearch(int[] arr, int startIndex, int endIndex, int target) {
		int midIndex = startIndex + (endIndex - startIndex) / 2;
		if (arr[midIndex] == target) {
			return midIndex;
		} else {
			if(startIndex == endIndex)
				return -1;
			if (arr[midIndex] > target) {
				return binarySearch(arr, startIndex, midIndex, target);
			} else {
				return binarySearch(arr, midIndex + 1, endIndex, target);
			}
		}
	}

}
