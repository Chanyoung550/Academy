package ch03;

public class IntergerLiterals {

	public static void main(String[] args) {
		int num1 = 123;
		int num2 = 0123;
		int num3 = 0x123;
		
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		System.out.println("num3:"+num3);
		
		System.out.println("11+22+33 = "+(11+22+33));
		System.out.println("011+022+033 ="+(011+022+033));
		System.out.println("0x11+0x22+0x33 ="+(0x11+0x22+0x33));
		
		System.out.println(3147483647L+3147483648L);
		byte seven = 0B111;
		int num205 = 0B11001101;
		
		System.out.println("seven:"+seven);
		System.out.println("num205:"+num205);
		
		System.out.println(3.0004999D + 2.0004999D);
		System.out.println(3.0004999f + 2.0004999f);

	}

}
