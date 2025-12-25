package problemsOnArrays.easy;

public class Question3 {
	public static void main(String[] args) {
		int arr[] = {5,6,7,8};
		boolean result = isSorted(arr);
		System.out.println(result);
	}

	private static boolean isSorted(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1])
				return false;
		}
		return true;
	}
}
