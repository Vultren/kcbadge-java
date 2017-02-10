package com.kancolle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kancolle.model.Server;
import com.kancolle.repository.ServerRepository;

@Controller
public class BadgeController {
	
	@Autowired
	ServerRepository serverRepository;
	
	@RequestMapping("/badge") 
	public String home() {
		return "index";
	}
	
	@GetMapping("/servers")
	@ResponseBody
	public List<Server> getServers() {
		return serverRepository.findAll();
	}
}
