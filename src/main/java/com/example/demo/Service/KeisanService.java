package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class KeisanService {

	public String tasuParam(String Param1,String Param2){
		int tasuResult;
		try {
			tasuResult = Integer.parseInt(Param1) + Integer.parseInt(Param2);
		} catch(Exception ex) {
			throw ex;
		}
		return String.valueOf(tasuResult);
	}
	
	public String hikuParam(String Param1,String Param2){
		int hikuResult;
		try {
			hikuResult = Integer.parseInt(Param1) - Integer.parseInt(Param2);
		} catch(Exception ex) {
			throw ex;
		}
		return String.valueOf(hikuResult);
	}
	
	public String kakeParam(String Param1,String Param2){
		int kakeResult;
		try {
			kakeResult = Integer.parseInt(Param1) * Integer.parseInt(Param2);
		} catch(Exception ex) {
			throw ex;
		}
		return String.valueOf(kakeResult);
	}
	public String waruParam(String Param1,String Param2){
		int waruResult;
		try {
			waruResult = Integer.parseInt(Param1) / Integer.parseInt(Param2);
		} catch(Exception ex) {
			throw ex;
		}
		return String.valueOf(waruResult);
	}
}

