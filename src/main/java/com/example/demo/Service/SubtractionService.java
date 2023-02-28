package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class SubtractionService {
	public String subtractionParam(String param1,String param2) {
		int subtraction;
		try {
			subtraction = Integer.parseInt(param1) - Integer.parseInt(param2);
		}catch(Exception e){
			throw e;
		}
		return String.valueOf(subtraction);
	}
}
