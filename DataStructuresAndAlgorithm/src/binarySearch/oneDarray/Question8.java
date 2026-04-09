package binarySearch.oneDarray;

public class Question8 {

	public static void main(String[] args) {
		int[] nums = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
		System.out.println(binarySearch(0,nums.length-1,nums,0));
	}

	private static boolean binarySearch(int start, int end, int[] arr, int target) {
		int mid = (start + end)/2;
		
		if(start> end) return false;
		if(arr[mid] == target)
			return true;
		
		if(arr[start] < arr[mid]) {
			if(arr[start] <= target && target < arr[mid]) {
				return binarySearch(start,mid-1,arr,target);
			}else {
				return binarySearch(mid+1,end,arr,target);
			}
		}else {
			if(arr[mid] < target && target <= arr[end]) {
				return binarySearch(mid+1,end,arr,target);
			}else {
				return binarySearch(start,mid-1,arr,target);
			}
		}
	}

}
