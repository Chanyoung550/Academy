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
		System.out.println("�ֹε�� ��ȣ : "+rNum);
		
		if(pNum!=0)
			System.out.println("���ǹ�ȣ : "+pNum+'\n');
		else
			System.out.println("������ ������ ���� �ʽ��ϴ�. \n");
	}
}
