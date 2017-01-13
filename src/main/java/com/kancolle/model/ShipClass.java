package com.kancolle.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShipClass {
	
	@JsonProperty(value="name")
	Translation className;
	
	private ArrayList<BaseShip> ships;

	public Translation getClassName() {
		return className;
	}

	public void setClassName(Translation className) {
		this.className = className;
	}

	public ArrayList<BaseShip> getShips() {
		return ships;
	}

	public void setShips(ArrayList<BaseShip> ships) {
		this.ships = ships;
	}
	
	
	
}
