package com.kancolle.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KanmusuDB {

	@JsonProperty(value="ship")
	private ArrayList<ShipClass> classes;
	
	@JsonProperty(value="ship_type")
	private ArrayList<ShipType> types;

	public ArrayList<ShipClass> getClasses() {
		return classes;
	}

	public void setClasses(ArrayList<ShipClass> classes) {
		this.classes = classes;
	}

	public ArrayList<ShipType> getTypes() {
		return types;
	}

	public void setTypes(ArrayList<ShipType> types) {
		this.types = types;
	}
	
	
}
