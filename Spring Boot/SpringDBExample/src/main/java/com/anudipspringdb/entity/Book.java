package com.anudipspringdb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name="bookdetails")
public class Book {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int bid;
	@Column(length=30, nullable=false)
	private String bname;
	@Column(length=30, nullable=false)
	private String authorname;
	@Column(length=30, nullable=false)
	private String type;
	private double price;

}
