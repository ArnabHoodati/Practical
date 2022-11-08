package com.anudipspring.entity;

public class Course {

	private String cname;
	private String cduration;
	private String trainer;
	public Course(String cname, String cduration, String trainer) {
		super();
		this.cname = cname;
		this.cduration = cduration;
		this.trainer = trainer;
	}
	
	
//	public String getCname() {
//		return cname;
//	}
//
//
//	public void setCname(String cname) {
//		this.cname = cname;
//	}
//
//
//	public String getCduration() {
//		return cduration;
//	}
//
//
//	public void setCduration(String cduration) {
//		this.cduration = cduration;
//	}
//
//
//	public String getTrainer() {
//		return trainer;
//	}
//
//
//	public void setTrainer(String trainer) {
//		this.trainer = trainer;
//	}


	@Override
	public String toString() {
		return "Course [cname=" + cname + ", cduration=" + cduration + ", trainer=" + trainer + "]";
	}
	
	
}
