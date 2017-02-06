package com.kancolle.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="abyssal")
@PrimaryKeyJoinColumn(name="ship_id")
public class Abyssal extends BaseShip{

	Boolean damageable;
}
