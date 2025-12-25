package problemsOnArrays.easy;

public class Question2 {

	public static void main(String[] args) {
		int arr[] = { 8, 10, 5, 7, 9 };
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		
		for(int i: arr) {
			if(i> max) {
				secondMax = max;
				max = i;
			}else if(i>secondMax ) {
				secondMax = i;
			}
			
			if(i< min) {
				secondMin = min;
				min = i;
			}else if(i<secondMin ) {
				secondMin = i;
			}
				
		}
		
		System.out.println("Second max = "+secondMax);
		System.out.println("Second min = "+secondMin);
	}

}
