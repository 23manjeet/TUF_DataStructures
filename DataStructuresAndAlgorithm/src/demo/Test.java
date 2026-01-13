package demo;

public class Test {
	public static void main(String[] args) {
		int a = 7;
		int b = 3;
		int diff = a - b;  // diff = 4 (int)
		int result = diff / 2;  // result = 2 (int, truncates 4/2=2.0)
		System.out.println((a-b)/2);
	}
}
