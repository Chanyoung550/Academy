package ch05;

public class Test5_7 {

	public static void main(String[] args) {
		
		for(int num=2;num<10;num+=2)
			for(int sum=1;sum<9;sum++) {
				if((num==2)&&(sum<=2))
					System.out.println(num+" X "+sum+" = "+num*sum);
				
				if((num==4)&&(sum<=4))
					System.out.println(num+" X "+sum+" = "+num*sum);
				
				if((num==6)&&(sum<=6))
					System.out.println(num+" X "+sum+" = "+num*sum);
				
				if((num==8)&&(sum<=8))
					System.out.println(num+" X "+sum+" = "+num*sum);
			}
		
		for(int a=0;a<99;a++) {
			for(int b=0;b<99;b++) {
				if(((a*10)+b)+((b*10)+a)==99) {
					int c =((a*10)+b);
					int d =((b*10)+a);
					System.out.println(c+" + "+d+" = "+(c+d));
				}
			}
			
		}	

	}

}
