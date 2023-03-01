package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class KakeService {
	public String KakeParam(String Param1, String Param2) {
		int result;
		try {
			result = Integer.parseInt(Param1) * Integer.parseInt(Param2);

		} catch (Exception ex) {
			throw ex;
		}
		return String.valueOf(result);
	}
}
