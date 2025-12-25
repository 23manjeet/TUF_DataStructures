package problemsOnArrays.easy;

public class Question6 {

	public static void main(String[] args) {
		int arr[] = { 1,2,3,4,5 };
		
		int n = 2;
		
		for(int j = 1;j<=n;j++) {
			int temp = arr[0];
			for(int i = 0;i<arr.length-1;i++) {
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]= temp;
		}
		
		for(int a:arr) {
			System.out.print(a+",");
		}
	}

}
