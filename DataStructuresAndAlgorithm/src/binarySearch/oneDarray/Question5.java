package binarySearch.oneDarray;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	private static int flourCeilPosition(int[] arr, int startIndex, int endIndex, int target) {
		int midIndex = startIndex + (endIndex - startIndex) / 2;
		if (arr[midIndex] == target) {
			return midIndex;
		} else {
			if(startIndex == endIndex)
				return -1;
			if (arr[midIndex] > target) {
				return flourCeilPosition(arr, startIndex, midIndex, target);
			} else {
				return flourCeilPosition(arr, midIndex + 1, endIndex, target);
			}
		}
	}
}
