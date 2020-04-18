package com.fali.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fali.dao.FunRepository;
import com.fali.model.Fun;

@Service
public class FunService {
	@Autowired
	private FunRepository funRepo;
	
	String line = "";
	String cvsSplitBy = ";";
	public void saveFunData() {
		try {
		//	BufferedReader br = new BufferedReader(new FileReader("src/main/resources/funclub1.csv"));
		BufferedReader br = new BufferedReader(
				new FileReader("C:\\Users\\El Mehdi\\Desktop\\falidev\\funclub1.csv"));
		    while((line=br.readLine())!=null) {
		    	String [] data=line.split(cvsSplitBy);
		    	
		    	Fun f=new Fun();
		    	
		    	f.setFname(data[0]);
		    	f.setLname(data[1]);
		    	f.setAdress(data[2]);
		        f.setAge(data[3]);
		        f.setClub(data[4]);
		        
		        funRepo.save(f);
		        
		    }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
