/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {
	/** 受講生ID */
	private int studentId;

	/** 受講生氏名 */
	private String studentName;

	/** 会社名 */
	private String companyName;

	/** 教室名 */
	private String className;

	/** メールアドレス */
	private String mail;

	/** パスワード */
	private String password;

	public int getStudentId() {//受講生ID
		return this.studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {//受講生名
		return this.studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCompanyName() {//会社名
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getClassName() {//教室名
		return this.className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getMail() {//メールアドレス
		return this.mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {//パスワード
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	}