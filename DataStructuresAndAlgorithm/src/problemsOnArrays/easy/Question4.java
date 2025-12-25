package problemsOnArrays.easy;

public class Question4 {
	public static void main(String[] args) {
		int arr[] = { 1,1,2,2,2,3,3 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[j] > arr[i]) {
					arr[i+1] = arr[j];
					break;
				}
			}
		}
		for(int i: arr)
		System.out.print(i+",");
	}
}
