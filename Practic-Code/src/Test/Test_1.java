package Test;
/*how to Transpose  a matrix */

public class Test_1 {
	public static void main(String[] args) {
		int[][] arr= {{5,8,6},{9,5,3},{5,2,7}};
		int[][] trr=new int [3][3];
		// printing the matrix before change
        System.out.println("printing the normal Matrix ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		// tranfer the matrix
		
        System.out.println("printing the Transpose  Matrix ");
        // Transdfer to the matrix
        for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				trr[i][j]=arr[j][i];
			}
		}
        
        // printing to the matrix
        for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(trr[i][j]+" ");
			}
			System.out.println();
		}
        

	
		
		
		System.out.println();
		System.out.println();
		
	}

}
