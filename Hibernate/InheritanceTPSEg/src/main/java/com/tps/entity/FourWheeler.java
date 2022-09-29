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
public class FourWheeler extends Vehicle {
	
	private int modelno;
	private String modelname;
	private boolean musicsystem;
	private String etype;
	private boolean ac;

}
