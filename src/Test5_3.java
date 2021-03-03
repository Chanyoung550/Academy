package ch05;

public class Test5_3 {

	public static void main(String[] args) {
		int n=2;
		
		if(n==1)
			System.out.println("Fantastic Java");
		else if(n==2)
			System.out.println("Funny Java");
		else if(n==3)
			System.out.println("Fantastic Java");
		else
			System.out.println("The best programing languege");
		
		System.out.println("Do you like Java");
		
		int n1= 24;
		
		switch(n1/10) {
		case 0:
			System.out.println("0이상 10미만의 수");
		case 1:
			System.out.println("10이상 20미만의 수");
		case 2:
			System.out.println("20이상 30미만의 수");
		default: 
			System.out.println("음수 혹은 30이상의 수");
		}
		
		
		

		}
		
	}
	
