package ch05;

public class BreakBasic {

	public static void main(String[] args) {
		int num=1;
		boolean search=false;
		
		while(num<100) {
			if(((num%5)==0)&&((num%7)==0)) {
				search=true;
				break;
			}
			num++;
		}
		if(search)
			System.out.println("찾는정수 : "+num);
		else
			System.out.println("5의 배수이자 7의 배수를 찾지못했습니다.");    //위에서 이미 true와 false를 분별했기때문에 사용하지 않는코드.
	}

}
