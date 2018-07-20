package practice13.common;

public class Employee extends Person {
	/*
	 * ★ common.Personクラスを継承して、common.Employeeクラスを作成してください
	 *
	 * フィールド
	 * 		departmentNm（部署名）		:	String
	 * 		departmentCnt（部署人数）	:	int
	 * メソッド
	 * 		各フィールドのアクセサ
	 */

	public String departmentNm;

	public int departmentCnt;

	public String getDepartmentNm() {
		return this.departmentNm;
	}

	public void setDepartmentNm(String departmentNm) {
		this.departmentNm = departmentNm;
	}


	public int getDpartmentCnt() {
		return this.departmentCnt;
	}

	public void setDpartmentCnt(int departmentCnt) {
		this.departmentCnt=departmentCnt;
	}




}
