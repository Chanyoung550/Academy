package ch11;

public class Person {
	private int rNum;
	private int pNum;
	
	Person(int rnum, int pnum){
		this.rNum=rnum;
		this.pNum=pnum;
	}
	Person(int rnum){
//		regiNum=rnum;
//		passNum=0;
		this(rnum,0);
	}
	void showPersonalInfo() {
		System.out.println("주민등록 번호 : "+rNum);
		
		if(pNum!=0)
			System.out.println("여권번호 : "+pNum+'\n');
		else
			System.out.println("여권을 가지고 있지 않습니다. \n");
	}
}
