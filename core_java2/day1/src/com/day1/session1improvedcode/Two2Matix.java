package com.day1.session1improvedcode;

public class Two2Matix {
	private int x[][] = { { 1, 0, 0 }, { 0, 1, 0}, { 0, 0, 1 } };

	public Two2Matix() {
	}

	public Two2Matix(int[][] x) {
		this.x = x;
	}

	void print2DMatrix() {
		for (int y[] : x) {
			for (int temp : y) {
				System.out.print(temp + " ");
			}
			System.out.println();
		}
	}

	boolean checkIsIdentiyMatrix() {
		boolean isIdentityMatrix = true;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				// we are talking about pri .. dia elements
				if (i == j) {
					if (x[i][j] != 1) {
						isIdentityMatrix = false;
						break;
					}
				} else {
					if (x[i][j] != 0) {
						isIdentityMatrix = false;
						break;
					}
				}
			}
		}
		return isIdentityMatrix;
	}

}
