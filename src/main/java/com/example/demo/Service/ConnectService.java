package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class ConnectService {
	public String Connect(String param1,String param2) {
		String result="";
		try{
			result = param1+param2;
		}catch(Exception ex) {
			throw ex;
		}
		return result;
	}
}
