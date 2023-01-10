package Test;

import java.util.*;

/*
 how to transpose a matrix without using the  temp matrix
*/

public class Test_2 {
	public static void main(String[] args) {
		// this case we try to take the input form the user
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER THE ROWS YOU WANT ");
		int row =scan.nextInt();
		System.out.println("ENTER THE COLOUM YOU WANT ");
		int col=scan.nextInt();
		// declare the matrix
		int [][] matrix=new int [row][col];
		// lets initialise the matrix we want 
		System.out.println("Enter the elements in a matrix");
		for (int i = 0; i <row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j]=scan.nextInt();
			}
		}
		// printing the matrix before we are switching 		System.out.println("printing the matrix before we are switching ");

		System.out.println("PRINT THE MATRIX BEFORE THE TRANSPOSE  ");
		for (int i = 0; i <row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}

		int temp=0;
		// Transpose the matrix 
		for (int i = 0; i <row; i++) {
			for (int j =i+1; j <col; j++) {

				temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
		
//		for (int i = 0; i <row; i++) {
//			for (int j =0; j <i; j++) {
//
//				temp=matrix[i][j];
//				matrix[i][j]=matrix[j][i];
//				matrix[j][i]=temp;
//			}
//		}
		System.out.println("PRINT THE MATRIX AFTER THE TRANSPOSE ");
		for (int i = 0; i <row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}

		
		
		

	}

}
