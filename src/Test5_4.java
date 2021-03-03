package ch05;

public class Test5_4 {

	public static void main(String[] args) {
		
		int num = 1;
        int sum = 0;
    
        while(num<100) {
            sum += num;
            num++;
            System.out.println(sum);
        }
			
		
		int num2=1;
		while(num2<=100) {
			System.out.println(num2);
			num2++;
		}
		
		num2=100;
		do {System.out.println(num2);
			num2--;
		}while(num2>0);
		
		int num3=1;
		int sum3=0;
		
		while(num3<=1000){
			if((num3%2)==0&&(num3%7)==0) {
				System.out.println(num3);
				sum3+=num3;
			}
			
		num3++;
		}
		System.out.println(sum3);
	}

}
