package com.kancolle.model.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ship {
	@JsonProperty(value="api_id")
	private int id;
	
	@JsonProperty(value="api_sortno")
	private int shipId;
	
	@JsonProperty(value="api_name")
	private String name;
	
	@JsonProperty(value="api_yomi")
	private String altName;
	
	@JsonProperty(value="api_stype")
	private int shipType;
	
	@JsonProperty(value="api_afterlv")
	private int remodelLvl;
	
	@JsonProperty(value="api_aftershipid")
	private int remodelShipId;
	
	@JsonProperty(value="api_taik")
	private int[] health;
	
	@JsonProperty(value="api_souk")
	private int[] armor;
	
	@JsonProperty(value="api_houg")
	private int[] power;
	
	@JsonProperty(value="api_raig")
	private int[] torp;
	
	@JsonProperty(value="api_tyku")
	private int[] aa;
	
	@JsonProperty(value="api_luck")
	private int[] luck;
	
	@JsonProperty(value="api_soku")
	private int speed;
	
	@JsonProperty(value="api_leng")
	private int range;
	
	/*@JsonProperty(value="api_slot_num":2)
	
	@JsonProperty(value="api_maxeq":[0,0,0,0,0])
	private int[] health;
	
	@JsonProperty(value="api_buildtime":18)
	private int buildTimeInMin;
	
	@JsonProperty(value="api_broken":[1,1,4,0])
	private int[] health;
	@JsonProperty(value="api_powup":[1,1,0,0])
	private int[] health;
	@JsonProperty(value="api_backs":3)
	
	@JsonProperty(value="api_getmes":"\u7766\u6708\u3067\u3059\u3002<br>\u306f\u308a\u304d\u3063\u3066\u3001\u307e\u3044\u308a\u307e\u3057\u3087\u30fc\uff01")
	
	@JsonProperty(value="api_afterfuel":100)
	
	@JsonProperty(value="api_afterbull":100)
	
	@JsonProperty(value="api_fuel_max":15)
	
	@JsonProperty(value="api_bull_max":15)
	
	@JsonProperty(value="api_voicef":0*/
}


