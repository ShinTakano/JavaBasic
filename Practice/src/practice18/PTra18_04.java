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

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {
		ArrayList<EntityPlayer> array = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {
				EntityPlayer player = new EntityPlayer();
				String line = scanner.nextLine();
				array.add(player);
				String a[] = line.split(",");
				player.setPosition(a[0]);
				player.setName(a[1]);
				player.setCountry(a[2]);
				player.setTeam(a[3]);
				// ★ 1行ごとにArrayListに格納してください
			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		Collections.shuffle(array);
		int GK = 0;
		int DF = 0;
		int MF = 0;
		int FW = 0;

		for (int i = 0; i < array.size() - 1; i++) {
			if (array.get(i).getPosition().equals("GK")) {
				System.out.println(array.get(i));
				GK++;
				if (GK == 1) {
					break;
				}
			}

		}
		for (int i = 0; i < array.size() - 1; i++) {
			if (array.get(i).getPosition().equals("DF")) {
				System.out.println(array.get(i));
				DF++;
				if (DF == 4) {
					break;
				}
			}
		}
		for (int i = 0; i < array.size() - 1; i++) {
			if (array.get(i).getPosition().equals("MF")) {
				System.out.println(array.get(i));
				MF++;
				if (MF == 4) {
					break;
				}
			}
		}
		for (int i = 0; i < array.size() - 1; i++) {
			if (array.get(i).getPosition().equals("FW")) {
				System.out.println(array.get(i));
				FW++;
				if(FW==2) {
					break;
				}

			}

		}
	}
}
