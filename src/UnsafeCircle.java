package ch08;


class UnsafeCircle{
	public static void main(String args[]) {
		Circle c=new Circle(1.5);
		System.out.println(c.getArea());
		
		c.setRad(2.5);
		System.out.println(c.getArea());
		c.setRad(-3.5);
		System.out.println(c.getArea());
//		c.rad=-4.5;
//		System.out.println(c.getArea());	옳지않은 접근방식
	}
}


