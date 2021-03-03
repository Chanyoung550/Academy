package ch06;

public class Test6_2 {
//	public static void main(String[] args) {
//		double circle1;
//		circle1=circle(5);
//		System.out.println("원의넓이는 "+circle1);
//		double circle3;
//		circle3=circle(5);
//		System.out.println("원의둘레는 "+circle3);
//		
//	}
//	public static double circle(double n1) {
//		double pie=3.14;
//		return n1*n1*pie;
//		
//	}
//	public static double circle2(double n2) {
//		double pie=3.14;
//		return n2*2*pie;
//	}
	public static void main(String[] args) {
		
		for(int num=1;num<100;num++)
			if(primeNumber(num))
				System.out.println(num);
		
	}
	public static boolean primeNumber(int num) {
		for(int i=2;i<num;i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
}