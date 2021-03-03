package ch13;

public class TwoDimenArray2 {

	public static void main(String[] args) {
		int[][] arr=new int[3][4];
		int num=1;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=num;
				num++;
				
			}
		}
		for(int[] i : arr) {
			for(int e : i) {
				System.out.print(e+"\t");
				

			}
			System.out.println();
		}

	}

}
