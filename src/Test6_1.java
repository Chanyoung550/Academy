package ch06;

public class Test6_1 {

//	public static void main(String[] args) {
//		plus(4,2);
//		minus(4,2);
//		multiplication(4,2);
//		division(4,2);
//		theRest(4,2);
//
//	}
//
//	public static void plus(int n1, int n2) {
//		System.out.println(n1+n2);
//	}
//	public static void minus(int s1, int s2) {
//		System.out.println(s1-s2);
//	}
//	public static void multiplication(int i1, int i2) {
//		System.out.println(i1*i2);
//	}
//	public static void division(int v1, int v2) {
//		System.out.println(v1/v2);
//	}
//	public static void theRest(int num1, int num2) {
//		System.out.println(num1%num2);
//	}
	
		public static void main(String[] args) {
	        abs(7, 3);
	        abs(-5, -3);
	        abs(4, -3);
	    }
	    
	    public static void abs(int n1, int n2) {
	        if(n1 > n2)
	            System.out.println(n1 - n2);
	        else
	            System.out.println(n2 - n1);
	    }
		
		
}

