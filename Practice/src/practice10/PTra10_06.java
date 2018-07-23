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
		Car[] cars = new Car[3];

		Car GTR = new Car();//GTRのインスタンス
		GTR.serialNo = 12;
		GTR.color = "Blue";
		GTR.gasoline = 50;

		Car Lexus = new Car();//Lexusのインスタンス
		Lexus.serialNo = 39;
		Lexus.color = "Red";
		Lexus.gasoline = 50;

		Car NSX = new Car();
		NSX.serialNo = 100;
		NSX.color = "Purple";
		NSX.gasoline = 50;

		cars[0] = GTR;
		cars[1] = Lexus;
		cars[2] = NSX;

		final int distance = 300;

		for (int i = 0; i < cars.length; i++) {
			int runmeter = 0;
			int time = 0;
			while(runmeter < distance) {
				int total = cars[i].run();
				time ++;
				if(total<0) {
					break;
				}else {
					runmeter += total;
				}
			}
			if(cars[i].gasoline < 0) {
				System.out.println("目的地に到達できませんでした。");
			}else {
				System.out.println("目的地にまで" + time + "時間かかりました。残りのガソリンは" + cars[i].gasoline + "リットルです。");
			}

		}

	}
//インスタンスが複数ある場合は「クラス型配列」を使う！！
}
