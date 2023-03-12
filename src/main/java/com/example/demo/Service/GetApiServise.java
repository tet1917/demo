package com.example.demo.Service;

import java.util.ArrayList;

import com.example.demo.Repository.GetApiRepository;
import com.example.demo.data.AddEntity;
import com.example.demo.data.Datum;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class GetApiServise {
	private final GetApiRepository getApiRepository;
	
	public GetApiServise(GetApiRepository getApiRepository) {
		this.getApiRepository = getApiRepository;
	}
	
	public ArrayList<Datum> getApi() throws JsonMappingException, JsonProcessingException {
		AddEntity addEntity = new AddEntity();
		addEntity = getApiRepository.callMethod();
		ArrayList<Datum> list = new ArrayList<Datum>();
		list.add((Datum) addEntity.getData());
		return list;
	}
}
