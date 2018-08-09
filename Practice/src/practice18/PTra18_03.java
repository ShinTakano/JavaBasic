/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PTra18_03 {

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
		for (int i = array.size() -1; i >= 0; i--) {
			if (array.get(i).getTeam().equals("レアル・マドリード") || array.get(i).getTeam().equals("バルセロナ")) {
				array.remove(i);
			}

		}

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください

		// ★ 削除後のArrayListの中身を全件出力してください
		for (EntityPlayer entityPlayer : array) {
			System.out.println(entityPlayer);
		}
	}
}
