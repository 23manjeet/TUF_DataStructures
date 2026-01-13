package binarySearch.oneDarray;

public class Question2 {

	public static void main(String[] args) {
		int[] arr = {3,5,8,15,19};

		int target = 9;

		int index = binarySearch(arr, 0, arr.length - 1, target);

		System.out.println(index);
	}
	
	private static int binarySearch(int[] arr, int startIndex, int endIndex, int target) {
		if(startIndex > endIndex) {
			if(startIndex == arr.length) return -1;
			return startIndex;

		}
			
		int midIndex = (endIndex + startIndex) / 2;
		if (arr[midIndex] == target) {
			return midIndex;
		} else {
			if (arr[midIndex] > target) {
				return binarySearch(arr, startIndex, midIndex-1, target);
			} else {
				return binarySearch(arr, midIndex + 1, endIndex, target);
			}
		}
	}

}
