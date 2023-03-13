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
		int plus = addEntity.getData().size();

		for (int i = 0; i < plus; i++) {
			list.add(addEntity.getData().get(i).getName() +addEntity.getData().get(i).getNote() + addEntity.getData().get(i).getAge().toString() + addEntity.getData().get(i).getRegisterDate());
		}
		return list;
		//	public String getApi() throws JsonMappingException, JsonProcessingException {
		// AddEntity addEntity = new AddEntity();
		// Datum datum = new Datum();
		// addEntity = getApiRepository.callMethod();
		// Map<String, String> exMap = new HashMap<>();
		// exMap.put(AddEntity.getData(), AddEntity.data);
		// exMap.forEach((key, val) -> (key + " : " + val));
		// Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
		// additionalProperties.put(Datum.getName(), Datum.name);
	}
}