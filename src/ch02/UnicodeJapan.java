package ch02;

public class UnicodeJapan {

	public static void main(String[] args) {
		char ch1= 0x3041;
		char ch2= 0x3051;
		char ch3= 0x3061;
		char ch4= 0x3071;
		System.out.println(ch1+" "+ch2+" "+ch3+" "+ch4);
		
		ch1 = 0x3043;
		ch2 = 0x3053;
		ch3 = 0x3060;
		ch4 = 0x3073;
		System.out.println(ch1+" "+ch2+" "+ch3+" "+ch4);   //같은변수를 사용하면 앞전변수를 덮어쓴다.

	}

}
