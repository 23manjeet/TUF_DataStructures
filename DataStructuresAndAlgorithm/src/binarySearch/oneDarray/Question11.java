package binarySearch.oneDarray;

/*
 * Find out how many times the array has been rotated

 */
public class Question11 {

	public static void main(String[] args) {
		int[] nums = {3,4,5,1,2};
		System.out.println(shortestElementIndex(nums,0,nums.length-1));
	}
	public static int shortestElementIndex(int[] num,int start,int end) {
		int mid = (start+end) / 2;
		if(start == end)
			return start;
		
		//smallest is in the right half
		if(num[mid]> num[end]) {
			start = mid+1;
			return shortestElementIndex(num,start,end);
		}else {
			end = mid;
			return shortestElementIndex(num, start, end);
		}
	}

}
