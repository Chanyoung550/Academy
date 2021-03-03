package ch14;

public class CheeseCake1 extends Cake1{
	public int size;
	public CheeseCake1(int sz1, int sz2) {
		super(sz1);
		size=sz2;
	}
	public void showCakeSize() {
		System.out.println("Bread Ounces : "+super.size);
		System.out.println("cheese Ounces : "+size);
	}
}
