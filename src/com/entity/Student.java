package com.entity;

public class Student {
	private Integer sid;
	private String sname;
	private String sex;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public Student() {
		super();
	}
	public Student(Integer sid, String sname, String sex) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sex = sex;
	}
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sex=" + sex + ", getSid()=" + getSid() + ", getSname()="
				+ getSname() + ", getSex()=" + getSex() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
