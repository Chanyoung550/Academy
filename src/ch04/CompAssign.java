package ch04;

public class CompAssign {

	public static void main(String[] args) {
		short num = 10;
		num = (short)(num+77L);    //형변환을 안하면 컴파일 오류발생
		int rate=3;
		rate=(int)(rate*3.5);    //형변환을 안하면 컴파일 오류발생
		System.out.println(num);
		System.out.println(rate);
		
		num = 10;
		num += 77L;    //형변환이 필요하지 않다.
		rate = 3;
		rate *= 3.5;    //형변환이 필요하지 않다.
		System.out.println(num);
		System.out.println(rate);
		

	}

}
