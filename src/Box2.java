package ch13;

public class Box2 {
	private String contents;
	private int boxNum;
	
	Box2(int num, String cont){
		boxNum=num;
		contents=cont;
		
	}
	public int getBoxNum() {
		return boxNum;
	}
	public String toString() {
		return contents;
	}
}
