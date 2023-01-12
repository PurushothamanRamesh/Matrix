package com.matrix;
/*
		Input: 
		1 2 3 4
		4 3 2 1
		7 8 9 6
		6 5 4 3
		Output:
		Principal Diagonal: 1, 3, 9, 3
		Secondary Diagonal: 4, 2, 8, 6
		
		Input:
		1 1 1
		1 1 1
		1 1 1
		Output:
		Principal Diagonal: 1, 1, 1
		Secondary Diagonal: 1, 1, 1
*/

public class Test_2 {
	
	public  static void principle(int[][] arr , int n) {

		System.out.println("Principle Diagonal ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i==j) {
					System.out.print(arr[i][j]+" ");
				}
			}
		
		}
	}
	
	public  static void Secondary(int[][] arr , int n) {

		System.out.println("Secondary Diagonal ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i+j==n-1) {
					System.out.print(arr[i][j]+" ");
				}
			}
		}
	}
	public static void main(String[] args) {
		int n=4;
		int[][] a = {   { 1, 2, 3, 4 },
		                { 5, 6, 7, 8 },
		                { 1, 2, 3, 4 },
		                { 5, 6, 7, 8 }
		            };
		principle(a, n);
		System.out.println();
		Secondary(a, n);
		
		
	}

	

}
