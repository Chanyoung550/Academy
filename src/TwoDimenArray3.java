package ch13;

public class TwoDimenArray3 {

	public static void main(String[] args) {
		int[][] arr= {   {1, 2, 3, 4},
					     {5, 6, 7, 8},
					     {9, 10, 11, 12}   };
		
		for(int[] n : arr) {
			for(int e : n) {
				System.out.print(e+"\t");
				

			}
			System.out.println();
		}
	}

}
