package ch11;

public class ConOverLoading {

	public static void main(String[] args) {
		Person jung =new Person(335577, 112233);
		Person jung1 =new Person(335577, 112234);
		Person hong =new Person(775544);
		
		jung.showPersonalInfo();
		jung1.showPersonalInfo();
		hong.showPersonalInfo();

	}

}
