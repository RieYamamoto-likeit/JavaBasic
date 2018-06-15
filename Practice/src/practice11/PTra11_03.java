package practice11;
/*
 * PTra11_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra11_03 {

	/*
	 * ★ PTra11_03クラスに、クラスフィールドでint型のnumberを定義してください
	 */
//	static int number;
	  int number;/*これがクラスフィールド*/

	/*
	 * ★ PTra11_03クラスのコンストラクタを引数なしで定義してください
	 * ★ 処理は、クラスフィールドnumberに1を加算してください
	 */
	 PTra11_03() {
			this.number+=1;
		}


	public static void main(String[] args) {


		PTra11_03 number1 =new PTra11_03();/*インスタンス化*/

//		number1.number+=1;

//		int number=PTra11_03.number();

//		number.number+=1;


//		number n =new number();




		// ★ sumメソッドを呼び出してください
		 number1.sum(2,3);/*インスタンス化したものを、メソッドに入れるからnumberが迷わずに出力できる。*/




	}

	public void sum(int x, int y) {
		System.out.println("sumメソッドを呼び出しました。" + x + "＋" + y + "＝" + (x + y));

		System.out.println("クラスフィールドnumber：" +number/* + ★ クラスフィールドnumberの出力をしてください */);
	}
}
