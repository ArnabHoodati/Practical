package com.tph.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@DiscriminatorValue(value = "four")
public class FourWheeler extends Vehicle {
	
	private int modelno;
	private String modelname;
	private boolean musicsystem;
	private String etype;
	private boolean ac;

}
