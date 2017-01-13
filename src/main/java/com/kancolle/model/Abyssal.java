package com.kancolle.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="ship_id")
public class Abyssal extends BaseShip{

	
	public Abyssal() {
		// TODO Auto-generated constructor stub
	}

}
