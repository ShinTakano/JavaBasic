package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□i↓
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□j→
		 */
		for(int i = 0 ; i < 5 ; i++ ) {
			for(int j = 0 ; j < 5 ; j++) {
				if(j < i) {
					System.out.print("■");
				}else {
					System.out.print("□");
				}
			}
			System.out.println(" ");
		}
		for(int a = 0 ; a < 5; a++) {
			for(int b = 0 ; b < 5 ;b++) {
				if(b < 5 -a) {
					System.out.print("■");
				}else {
					System.out.print("□");
				}
			}
			System.out.println(" ");
		}



	}
}

