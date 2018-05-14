package practice07;
/*
 * PTra07_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_03 {
	public static void main(String[] args) {

		// ★ char型の配列keywordを定義し 「'平', '島', '沼', '山', '森'」 で初期化してください
		char[] keyword = new char[] {'平', '島', '沼', '山', '森'};



//		char keyword;
//		keyword = '平';
//		keyword = '島';
//		keyword = '沼';
//		keyword = '山';
//		keyword = '森';


		// ★ 配列keywordに格納されている値を後ろから順番に全て表示してください
		for(int i = keyword.length -1;i>=0;i--) {
			System.out.println(keyword[i]);
		}
//		(keyword.length-1)←どれだけ増えても大丈夫
//



//		int char;
//		for(char keyword=0; i<keyword -1 ;i--) {
//			System.out.println(char[i]);
//		}

	}
}
