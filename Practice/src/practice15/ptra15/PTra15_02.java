/*
 * PTra15_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice15.ptra15;

import practice15.common.Java2Month;
import practice15.common.Room;

public class PTra15_02 {
	public static void main(String[] args) {

		Room room = new Java2Month();

		// roomに格納されたJava2MonthインスタンスのgetCurriculumメソッドを呼び出してください



//		room[] getCurriculum();
//		Room[] rooms = {
//				new Java2Month()
//		};


		// 取得したカリキュラム情報を全て出力してください

//		for(Room room : rooms) {
		String[] curriculums = ((Java2Month)room).getCurriculum();
		for(String curriculum :curriculums) {
			System.out.println(curriculum);
		}
//		System.out.println(((Java2Month)room).getCurriculum());

	}
}

;