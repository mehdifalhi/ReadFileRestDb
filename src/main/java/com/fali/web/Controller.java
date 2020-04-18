package com.fali.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fali.service.FunService;

@RestController
public class Controller {
	@Autowired
	private FunService fs;
	
	@RequestMapping(path = "feedFunData")
	public void setDataInDB() {
		fs.saveFunData();
	}

}
