package problemsOnArrays.easy;

public class Question8 {

	public static void main(String[] args) {
		int arr[] = { 8, 10, 5, 7, 9 };
		int n =6;
		boolean present =false;
		
		for(int i =0 ; i<arr.length;i++) {
			if(arr[i] == n) {
				System.out.println(i);
				present = true;
			}
		}
		if(present)System.out.println("");else System.out.println("-1");
	}

}
