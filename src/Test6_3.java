package ch06;

public class Test6_3 {

//	public static void main(String[] args) {
//		System.out.println("2�� 5���� : "+num(5));
//		System.out.println("2�� 7���� : "+num(7));
//
//	}
//	public static int num(int n) {
//		if(n==0)
//			return 1;
//		else
//			return 2*num(n-1);
//	}
	public static void main(String[] args) {
		sum(10);
	}
	public static int sum(int n) {
		if(n>0) {
			int s = n%2 ;
			n/=2;
			sum(n);
			System.out.println(s);
		}
		return 0;
	}
	
}
