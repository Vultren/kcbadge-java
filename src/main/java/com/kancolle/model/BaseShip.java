package com.kancolle.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class BaseShip {
	
	public Integer id;
	public Offset imageOffset;
	public ShipType type;
	
	@JsonProperty(value="name_en")
	public String nameEn;

	@JsonProperty(value="name_jp")
	public String nameJp;

	@JsonProperty(value="name_ch")
	public String nameCh;

	@JsonProperty(value= "name_tw")
	public String nameTw;
	
}
