package ch05;

public class Test5_6 {

	public static void main(String[] args) {
		
		
		int count=0;
		for(int num=1;num<=100;num++) {
			if(((num%5)!=0)||((num%7)!=0))
				continue;
			count++;
			System.out.println(num);
		}
		System.out.println("count: "+count);
		
		
		int sum = 0;
		int n =1;
		while(sum < 1000) {
			if(( n % 2 ) == 1) {
				sum += n;
				System.out.println(n+" : "+sum);
				if(sum>1000)
					break;
			}
			n++;
		}
		System.out.println("1000을 넘어선 값 : "+n +" : "+sum);
	}

}
