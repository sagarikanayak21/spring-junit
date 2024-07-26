package com.sn.junit.vo;

public class Student {
	private int sid;
	private String fName;
	private String lName;
	private String course;
	private String dept;
	private String gender, address;
	
	public int getSid() {
		return sid;
	}
	public Student(int sid, String fName, String lName) {
		super();
		this.sid = sid;
		this.fName = fName;
		this.lName = lName;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
