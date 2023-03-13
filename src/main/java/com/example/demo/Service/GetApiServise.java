package com.example.demo.Service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.GetApiRepository;
import com.example.demo.data.AddEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Service
public class GetApiServise {
	private final GetApiRepository getApiRepository;
	
	

	public GetApiServise(GetApiRepository getApiRepository) {
		this.getApiRepository = getApiRepository;
	}

	
	public ArrayList<String> getApi() throws JsonMappingException, JsonProcessingException {
		AddEntity addEntity = new AddEntity();
		addEntity = getApiRepository.callMethod();
		ArrayList<String> list = new ArrayList<String>();
		list.add(addEntity.getData().get(0).getName());
		return list;
	}
}
