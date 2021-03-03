package ch10;

public class classMethod {

	public static void main(String[] args) {
		NumberPrinter.showInt(20);
		NumberPrinter.showDouble(3.15);
		
		NumberPrinter np=new NumberPrinter();
//		np.showDouble(3.15);
		np.setMyNumber(75);
		np.showMyNumber();

	}

}
