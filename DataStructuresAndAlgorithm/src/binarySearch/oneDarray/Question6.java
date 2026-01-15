package binarySearch.oneDarray;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2, 2 , 3 , 3 , 3 , 3 , 4};
		int target = 4;
		int[] arr = { -1, -1 };
		if (nums.length != 0)
			firstAndLastPos(nums, arr, 0, nums.length-1, target);
//		int count = arr[1]-arr[0]+1;
//		System.out.println(count);
		for (int i : arr)
			System.out.println(i);
	}

	public static void firstAndLastPos(int[] nums, int[] arr, int firstIndex, int lastIndex, int target) {
		if (firstIndex > lastIndex)
			return;

		int mid = (firstIndex + lastIndex) / 2;

		if (nums[mid] == target) {
			if (mid != 0 && nums[mid - 1] == target)
				firstAndLastPos(nums, arr, firstIndex, mid - 1, target);
			else if ( mid == 0 ||nums[mid - 1] != target)
				arr[0] = mid;

			if (mid != nums.length-1 && nums[mid + 1] == target)
				firstAndLastPos(nums, arr, mid + 1, lastIndex, target);
			else if (mid == nums.length-1 || nums[mid + 1] != target)
				arr[1] = mid;
		}

		else if (target < nums[mid])
			firstAndLastPos(nums, arr, firstIndex, mid - 1, target);
		else
			firstAndLastPos(nums, arr, mid + 1, lastIndex, target);
	}

}
