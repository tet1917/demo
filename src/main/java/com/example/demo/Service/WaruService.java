package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class WaruService {
	public String waru(String Param1, String Param2) {
		int waruResult;
		try {
			waruResult = Integer.parseInt(Param1) / Integer.parseInt(Param2);
		} catch (Exception ex) {
			throw ex;
		}
		return String.valueOf(waruResult);
	}
}
