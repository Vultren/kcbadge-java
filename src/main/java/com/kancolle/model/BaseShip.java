package com.kancolle.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class BaseShip {
	
	@Id
	public Integer id;
	
	@ManyToOne
    @JoinColumn(name = "offset_id", referencedColumnName = "id")
	public Offset imageOffset;
	
	@ManyToOne
    @JoinColumn(name = "ship_type", referencedColumnName = "id")
	public ShipType type;
	
	@ManyToOne
    @JoinColumn(name = "ship_class", referencedColumnName = "id")
	public ShipClass shipClass;
	
	@JsonProperty(value="name_en")
	public String nameEn;

	@JsonProperty(value="name_jp")
	public String nameJp;

	@JsonProperty(value="name_ch")
	public String nameCh;

	@JsonProperty(value= "name_tw")
	public String nameTw;
	
}
