package com.kancolle.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="ship_id")
public class Kanmusu extends BaseShip {

	public Kanmusu() {
		// TODO Auto-generated constructor stub
	}

}
