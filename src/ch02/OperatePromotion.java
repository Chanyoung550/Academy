package ch02;

public class OperatePromotion {

	public static void main(String[] args) {
		short num1 = 11;
		short num2 = 22;
		//short result = num1 + num2;    //java에서는 정수형 연산을 int형으로 진행한다.
		//int result = num1 + num2;   이렇게도 가능함.
		short result = (short)(num1 + num2);   //형변환
		System.out.println(result);

	}

}
