package ch05;

public class Test5_5 {

	public static void main(String[] args) {
		int sum=1;
		for(int num=1;num<=10;num++) {
			sum*=num;
		}
		System.out.println(sum);
		
		
		for(int sum1=2;sum1<10;sum1++) {
			for(int num1=1;num1<10;num1++) {
				System.out.println(sum1+" X "+num1+" = "+ sum1*num1);
				}
		}
	}

}
