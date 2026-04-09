package binarySearch.oneDarray;

//minimum in rotated sorted array
public class Question10 {

	public static void main(String[] args) {
		int[] nums = { 5,1,2,3,4 };
		System.out.println(binarySearch(0, nums.length - 1, nums));
	}

	private static int binarySearch(int start, int end, int[] arr) {
		int mid = (start + end) / 2;

		if (start > end) {
			return -1;
		}
		if (mid != 0 && arr[mid] < arr[mid - 1])
			return arr[mid];
		else if(mid == 0)
			return arr[mid];

		if (arr[start] > arr[end]) {
			if (arr[mid] < arr[start])
				return binarySearch(start, mid - 1, arr);
			else
				return binarySearch(mid + 1, end, arr);
		}else {
			return binarySearch(start, mid - 1, arr);
		}

	}

}
