package com.day1.session1improvedcode;

public class TwoDMatrixOperations {
	
	public static void main(String[] args) {
		
		
		int x[][]= {{1,0,0},{0,1,1},{0,0,1}};
		print2DMatrix(x);
		boolean result=checkIsIdentiyMatrix(x);
		System.out.println(result);
	}

	private static boolean checkIsIdentiyMatrix(int[][] x) {
		boolean isIdentityMatrix=true;
		for(int i=0;i<x.length ;i++) {
			for(int j=0;j<x[i].length; j++) {
				//we are talking about pri .. dia elements
				if(i==j) {
					if(x[i][j]!=1) {
						isIdentityMatrix=false;
						break;
					}
				}else {
					if(x[i][j]!=0) {
						isIdentityMatrix=false;
						break;
					}
				}
			}
		}
		return isIdentityMatrix;
	}

	static void print2DMatrix(int[][] x) {
		for(int y[]:x) {
			for(int temp: y) {
				System.out.print(temp+" ");
			}
			System.out.println();
		}
	}

}
