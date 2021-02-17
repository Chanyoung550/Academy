package ch04;

public class SCE {

	public static void main(String[] args) {
		int num1= 0;
		int num2= 0;
		boolean result;
		
		result=((num1+=10)<0)&&((num2+=10)>0);
		System.out.println("result = "+result);
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2+'\n');    //'\n'Àº °³Çà
		
		result=((num1+=10)>0)||((num2+=10)>0);
		System.out.println("result = "+result);
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2+'\n');
		
		num1=0;
		num2=0;
		
		result=((num1+=10)>0)&&((num2+=10)<0);
		System.out.println("result = "+result);
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2+'\n');
		
		
		result=((num1+=10)<0)||((num2+=10)>0);
		System.out.println("result = "+result);
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2+'\n');
		
		
		int num01=10;
		int num02=20;
		int num03=30;
		num01=num02=num03;
		System.out.println(num01);
		System.out.println(num02);
		System.out.println(num03);
		
		
		
		System.out.println(((25*5)+(36-4)-72)/5);
		
		int result03=3+6;
		System.out.println(result03);
		result03+=9;
		System.out.println(result03);
		result03+=12;
		System.out.println(result03);
		
		
	
		int n1= ((25+5)+(36/4)-72)*5;
		int n2= ((25*5)+(36-4)+71)/4;
		int n3= (128/4)*2;
		boolean result2;
			
		result2=((n1>n2)&&(n2>n3));
		System.out.println("result = "+result2);
		System.out.println("n1 = "+n1);
		System.out.println("n2 = "+n2);
		System.out.println("n3 = "+n3);
		
	

		
	}

}
