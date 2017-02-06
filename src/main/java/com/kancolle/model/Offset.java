package com.kancolle.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Offset {
	@Id
	private Integer id;
	
	@Column(name="offset_x")
	private Integer  x;
	
	@Column(name="offset_y")
	private Integer  y;
	
	@Column(name="dam_offset_x")
	private Integer  damagedX;
	
	@Column(name="dam_offset_y")
	private Integer  damagedY;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public Integer getDamagedX() {
		return damagedX;
	}

	public void setDamagedX(Integer damagedX) {
		this.damagedX = damagedX;
	}

	public Integer getDamagedY() {
		return damagedY;
	}

	public void setDamagedY(Integer damagedY) {
		this.damagedY = damagedY;
	}
	
}
