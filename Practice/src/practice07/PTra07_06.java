package practice07;
/*
 * PTra07_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_06 {
	public static void main(String[] args) {

		// ★ ※2次元配列を用いています
		int[][] array = {
				{ 500, 40, 6 },
				{ 70, 8, 90, 1000 }
		};

		// ★ 配列arrayに格納されている全ての数字の平均を出力してください
		int sum = 0;
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}

		System.out.println((double) sum/count);

		//		for(int i=0; i< array.length ;i++) {
		//			int sum = 0;
		//			for(int j=0; j< array.length;j++)
		//				sum +=array[i][j];
		//			System.out.println(i+1+(double)sum/array[i].length);
		//
		//		}

		//		for(int j=0;j<array.length;j++) {
		//			int sum = 0;
		//			for(int i=0; j< array.length;i++)
		//				sum +=array[i][j];
		//			System.out.println(j+1+(double)sum/array.length);
		//		}

		//		System.out.println(array[0]);
		//		System.out.println(array[2]);

	}
}
