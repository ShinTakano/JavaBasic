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
	int number;//クラスフィールドの定義

	/*
	 * ★ PTra11_03クラスのコンストラクタを引数なしで定義してください
	 * ★ 処理は、クラスフィールドnumberに1を加算してください
	 */
	PTra11_03(){
		this.number += 1;//クラスのコンストラクタ
	}

	public static void main(String[] args) {

		// ★ sumメソッドを呼び出してください　※クラスのインスタンス化が必要
		PTra11_03 sum = new PTra11_03();
		sum.sum(3, 5);

	}

	public void sum(int x, int y) {
		System.out.println("sumメソッドを呼び出しました。" + x + "＋" + y + "＝" + (x + y));

		System.out.println("クラスフィールドnumber：" + number/* + ★ クラスフィールドnumberの出力をしてください */);
	}
}
