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
@DiscriminatorValue(value = "two")
public class TwoWheeler extends Vehicle {

	
	private int modelno;
	private String modelname;
	private boolean abs;
	private int tyretype;
	private String btype;
}
