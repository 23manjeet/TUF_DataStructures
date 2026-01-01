package problemsOnArrays.easy;

public class Question10 {

	public static void main(String[] args) {
		int n = 5;
		int arr[] = { 1, 2, 4, 5 };
		for (int i = 1; i <= n; i++) {
			if(arr[i-1] != i) {
				System.out.println(i);
				break;
			}
		}

	}

}
