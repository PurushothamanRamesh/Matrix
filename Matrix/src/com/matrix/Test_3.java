/**
 * 
 */
package com.matrix;

import java.util.Arrays;

/**
 Input : mat[][] = { {5, 4, 7}, 
                     {1, 3, 8}, 
                     {2, 9, 6} }
 Output :     1 2 3
              4 5 6
              7 8 9
 */
public class Test_3 {
	public static void main(String[] args) {
	// declaring and initialize the matris
		int n=3;
		int mat[][] = { {5, 4, 7}, 
		                {1, 3, 8}, 
		                {2, 9, 6} 
		              };
		System.out.println("Before SOrting the matrix ");
		beforeSort(mat , n);
		sort(mat,n);

	}

	public  static void sort(int[][] mat, int n) {
		int [] arr=new int [n*n];
		int m=0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				arr[m++]=mat[i][j];
			}
		}
		Arrays.sort(arr);
		int mm=0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j]=arr[mm++];
			}
		}
		System.out.println("Printing the orting Matrix");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	

	public  static void beforeSort(int[][] mat, int n) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
