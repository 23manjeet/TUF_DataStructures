package binarySearch.oneDarray;

import java.util.HashMap;
import java.util.Map;

/**
 * return the index if target is found, else return where it should be in sorted
 * order
 */
public class Question4 {

	public static void main(String[] args) {
		int arr[] = {3, 4, 4, 7, 8, 10};
		int target = 8;

		Map<Integer,Integer> pos = insertPosition(arr, 0, arr.length - 1, target);
		System.out.println(pos);
	}

	public static Map<Integer,Integer> insertPosition(int[] arr, int startIndex, int endIndex, int target) {
		Map<Integer,Integer> mp = new HashMap<>();
		if (startIndex > endIndex) {
			if(startIndex == arr.length)
				mp.put(arr[endIndex], arr[endIndex]);
			else if(endIndex <= 0) {
				mp.put(arr[startIndex], arr[startIndex]);
			}
			else
				mp.put(arr[endIndex], arr[startIndex]);
			return mp;
		}
		int mid = (startIndex + endIndex) / 2;
		if (arr[mid] == target) {
			mp.put(arr[mid], arr[mid]);
			return mp;
		}
		else if (target < arr[mid])
			return insertPosition(arr, startIndex, mid - 1, target);
		else
			return insertPosition(arr, mid + 1, endIndex, target);

	}

}
