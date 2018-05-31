package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car[] car=new Car[3];

		Car car1=new Car();
		car1.color="red";
		car1.gasoline=30;

		Car car2=new Car();
		car2.color="blue";
		car2.gasoline=40;

		Car car3=new Car();
		car3.color="yellow";
		car3.gasoline=50;

		final int distance = 300;
		car[0]=car1;
		car[1]=car2;
		car[2]=car3;



		for(int i=0;i<car.length;i++) {


			int sum = 0;
			int count = 0;
//
//		Car cars=new Car();
//
//		car[i]=cars;


		while(true) {

			int run=car[i].run();
			count++;

			if(run==-1) {
				System.out.println("目的地に到達できませんでした");
				break;
			}

			sum += run;
//			System.out.println(sum);

			if(sum>distance) {
				System.out.println("目的地までに"+count+"時間かかりました。残りのガソリンは、"+car[i].gasoline+"リットルです");
			break;
			}

		}

//
//		for(int i =0;i<car.length;i++) {
//			System.out.println(car[i].color);
//			System.out.println();
//
//		}






	}
}
}