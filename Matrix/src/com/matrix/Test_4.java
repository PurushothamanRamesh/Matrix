/**
 * 
 */
package com.matrix;

import java.util.Collections;

/**
		 Given a square matrix, the task is 
		 that turn it by 180 degrees in an anti-clockwise 
		 direction without using any extra space.
  
 * 
		There are four steps that are required to solve this problem:
		1- Find the transpose of a matrix. 
		2- Reverse columns of the transpose. 
		3- Find the transpose of a matrix. 
		4- Reverse columns of the transpose
 
 */
public class Test_4 {
	public static void mainstatement(int [][] arr,int row ,int col) {
		firstTranspose(arr,row,col);
		reverseColumsFirst(arr,row,col);
		secondTranspose(arr,row,col);
		reverseColumSecond(arr,row,col);
	}
	static void firstTranspose(int [][] arr,int row,int col) {
		int temp=0;
		for (int i = 0; i <row; i++) {
			for (int j =i+1; j <col; j++) {
				temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
				}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	static void reverseColumsFirst(int[][] arr,int row,int col) {
		int temp=0;
		int k=row-1;
		for (int i = 0; i <row/2; i++) {
			for (int j =0; j <col; j++) {
				if(k>=(row/2)) {
					temp=arr[i][j];
					arr[i][j]=arr[k][j];
					arr[k][j]=temp;
					}
			}
			k--;
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
System.out.println();
	}
	static void secondTranspose(int [][] arr,int row,int col) {
		int temp=0;
		for (int i = 0; i <row; i++) {
			for (int j =i+1; j <col; j++) {
				temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
				}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	static void reverseColumSecond(int[][] arr,int row,int col) {
		int temp=0;
		int k=row-1;
		for (int i = 0; i <row/2; i++)  {
			for (int j =0; j <col; j++) {
				if(k>=(row/2)) {
					temp=arr[i][j];
					arr[i][j]=arr[k][j];
					arr[k][j]=temp;
					}
			}
			k--;
		}
		System.out.println();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	

	public static void main(String[] args) {
		int row=4;
		int col=4;
		int arr[][] = { { 1, 2, 3, 4 },
		                { 5, 6, 7, 8 },
		                { 9, 10, 11, 12 },
		                { 13, 14, 15, 16 }
		              };
		mainstatement(arr,row,col);
	
	}

}
