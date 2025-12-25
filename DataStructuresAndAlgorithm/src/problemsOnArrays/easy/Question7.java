package problemsOnArrays.easy;

public class Question7 {

	public static void main(String[] args) {
		int arr[] = { 1, 0, 2, 3, 0, 4, 0, 1 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				for (int j = i; j < arr.length; j++) {
					if (arr[j] > 0) {
						swap(arr,i,j);
						break;
					}
				}
			}
		}
		
		for(int a: arr) {
			System.out.print(a+" ");
		}
	}
	
	public static void swap(int[] arr, int firstIndex, int secondIndex) {
		int temp = arr[firstIndex];
		arr[firstIndex] = arr[secondIndex];
		arr[secondIndex] = temp;
	}

}
