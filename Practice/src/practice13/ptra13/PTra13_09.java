/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Employee;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = {"山田", "佐藤", "小林"};

	/** メールデータ（定数） */
	public static final String[] MAILDATA = {"yamada@hoge.com","satou@hoge.com","kobayashi@hoge.com"};

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = {"rezo0001","rezo0002","rezo0003"};

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
														{"総務部","業務部","システム部"},
														{"5","10","35"},
													};

	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください

		Employee[] employee;
		employee = new Employee[3];

		for(int i=0;i<employee.length;i++) {
			for(int j=0;j<employee.length;j++) {
			Employee em =new Employee();
			em.setUserNm(NAMEDATA[i]);
			em.setMail(MAILDATA[i]);
			em.setPassword(PASSDATA[i]);
			em.setDepartmentNm(QUATERDATA[0][i]);
//			String  setDpartmentCnt= String.valueOf(QUATERDATA[1][i]);
			int  setDpartmentCnt = Integer.parseInt(QUATERDATA[1][i]);
			em.setDpartmentCnt(setDpartmentCnt);


			employee[i] = em;

			}

//		}






//
//		for(int i=0;i<NAMEDATA.length;i++) {
////			Employee employee =new Employee();
//
//			System.out.println(NAMEDATA[i]);
//			for(int y=0;y<MAILDATA.length;y++)
//				System.out.println(MAILDATA[y]);
//
//				for(int x=0;x<PASSDATA.length;x++)
//					System.out.println(PASSDATA[x]);
//
//					for(int z=0;z<QUATERDATA.length;z++)
//						System.out.println(QUATERADATA[i][z]);
//
//
//
//		}







//
//		Employee employee = new Employee();
//
//		employee.setUserNm(NAMEDATA[0]);
//		System.out.println(employee.getUserNm());
//
//		Employee employee1 =new Employee();
//
//		employee1.setMail(MAILDATA[0]);
//		System.out.println(employee1.getMail());
//
//
//		Employee employee2 =new Employee();
//
//		employee2.setPassword(PASSDATA[0]);
//		System.out.println(employee2.getPassword());
//






//
//		employee.setUserNm("山田");
//		employee.setMail("yamada@hoge.com");
//		employee.setPassword("rezo0001");


//		employee.setUserNm("山田");
//		employee.setUserNm("佐藤");





	}

	}
}