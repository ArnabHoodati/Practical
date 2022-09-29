package com.tps.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name="vid")
public class TwoWheeler extends Vehicle {

	
	private int modelno;
	private String modelname;
	private boolean abs;
	private int tyretype;
	private String btype;
}
