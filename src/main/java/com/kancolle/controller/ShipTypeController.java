package com.kancolle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kancolle.model.ShipType;
import com.kancolle.repository.TypeRepository;

@Controller
@RequestMapping("/type")
public class ShipTypeController {
	
	@Autowired
	TypeRepository typeRepository;
	
	@RequestMapping(value="/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<ShipType> getAllShipTypes() {
		return typeRepository.findAll();
		
	}
	
}
