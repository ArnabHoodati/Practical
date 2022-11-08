package com.anudipspring.entity;

public class Student {
	private int sid;
	private String sname;
	private String semail;
	private double sfees;
	
	private Course course;	//has a relationship
	
	public Student(int sid, String sname, String semail, double sfees, Course course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.semail = semail;
		this.sfees = sfees;
		this.course = course;
	}

//	public int getSid() {
//		return sid;
//	}
//
//	public void setSid(int sid) {
//		this.sid = sid;
//	}
//
//	public String getSname() {
//		return sname;
//	}
//
//	public void setSname(String sname) {
//		this.sname = sname;
//	}
//
//	public String getSemail() {
//		return semail;
//	}
//
//	public void setSemail(String semail) {
//		this.semail = semail;
//	}
//
//	public double getSfees() {
//		return sfees;
//	}
//
//	public void setSfees(double sfees) {
//		this.sfees = sfees;
//	}
//
//	public Course getCourse() {
//		return course;
//	}
//
//	public void setCourse(Course course) {
//		this.course = course;
//	}

	public void show() {
		System.out.println(sid +" "+ sname +" "+ sfees +" "+ semail);
		System.out.println(course.toString());
		
	}

}
