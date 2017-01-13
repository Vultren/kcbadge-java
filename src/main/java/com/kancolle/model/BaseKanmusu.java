package com.kancolle.model;

import java.awt.Point;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseKanmusu {
	@JsonProperty(value="name")
	private Translation shipName;
	
	private Point offset;
	
	private Point offset2;
	
	private int rarity;
	
	private int type;
	
	private List<String> seasonal;
	
	@JsonProperty(value="implicates")
	private List<Long> implications;
	
	public Translation getShipName() {
		return shipName;
	}
	public void setShipName(Translation shipName) {
		this.shipName = shipName;
	}
	public Point getOffset() {
		return offset;
	}
	public void setOffset(Point offset) {
		this.offset = offset;
	}
	public Point getOffset2() {
		return offset2;
	}
	public void setOffset2(Point offset2) {
		this.offset2 = offset2;
	}
	public int getRarity() {
		return rarity;
	}
	public void setRarity(int rarity) {
		this.rarity = rarity;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public List<String> getSeasonal() {
		return seasonal;
	}
	public void setSeasonal(List<String> seasonal) {
		this.seasonal = seasonal;
	}
	public List<Long> getImplications() {
		return implications;
	}
	public void setImplications(List<Long> implications) {
		this.implications = implications;
	}
	
	
}
