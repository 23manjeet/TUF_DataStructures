package problemsOnArrays.medium;

/**
 * Two Sum : Check if a pair with given sum exists in Array
 */

public class Question1 {

	public static void main(String[] args) {
		int[] arr = { 2, 6, 5, 8, 11 };
		int target = 14;
//		int[] sol = {};

		  for (int i = 0; i < arr.length - 1; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if ((arr[i] + arr[j]) == target) {
	                   arr = new int[] {i,j};
	                }
	            }
	        }
		  for(int i = 0;i<arr.length;i++)
			  System.out.println(arr[i]);

	}

}
