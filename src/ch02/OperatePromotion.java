package ch02;

public class OperatePromotion {

	public static void main(String[] args) {
		short num1 = 11;
		short num2 = 22;
		//short result = num1 + num2;    //java������ ������ ������ int������ �����Ѵ�.
		//int result = num1 + num2;   �̷��Ե� ������.
		short result = (short)(num1 + num2);   //����ȯ
		System.out.println(result);

	}

}
