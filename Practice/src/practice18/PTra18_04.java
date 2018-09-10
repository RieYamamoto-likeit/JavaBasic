/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		 ArrayList<Player> array = new ArrayList<>();
	        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
	            while (scanner.hasNext()) {
	                String line = scanner.nextLine();

	                String[] list = line.split(",",0);
	                Player player = new Player();

	            	player.setPosition(list[0]);
             	player.setName(list[1]);
             	player.setCountry(list[2]);
             	player.setTeam(list[3]);

             	  array.add(player);




	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("ファイルが見つかりません");
	        }



		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください


	        ArrayList<Player> GK = new ArrayList<>();

	        ArrayList<Player> DF = new ArrayList<>();

	        ArrayList<Player> MF = new ArrayList<>();

	        ArrayList<Player> FW = new ArrayList<>();

	        for(Player pl:array) {
	        	if(pl.getPosition().equals("GK")) {
	        		GK.add(pl);
	        	}
	        	if(pl.getPosition().equals("DF")) {
	        		DF.add(pl);
	        	}
	        	if(pl.getPosition().equals("MF")) {
	        		MF.add(pl);
	        	}
	        	if(pl.getPosition().equals("FW")) {
	        		FW.add(pl);
	        	}
	        }

	        Collections.shuffle(GK);
	        Collections.shuffle(DF);
	        Collections.shuffle(MF);
	        Collections.shuffle(FW);

	        for(int i = 0;i < 1 ; i++ ) {
	        	System.out.println(GK.get(i));
	        }
	        for(int i = 0;i < 4 ; i++) {
	        	System.out.println(DF.get(i));
	        }
	        for(int i = 0;i < 4 ; i++) {
	        	System.out.println(MF.get(i));
	        }
	        for(int i = 0;i < 2 ; i++) {
	        	System.out.println(FW.get(i));
	        }





	}
}
