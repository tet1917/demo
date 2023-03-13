//ヒント
//・RestTemplateというクラスのgetForEntity(url,String.class)というメソッドでAPIコールできます。
//・ResponseEntity<String> resでAPIレスポンスを受け取ります。
//・resのgetBody()というメソッドで徳川家康とかのjsonが取れます。
//・ObjectMapper()というクラスのreadValueというメソッドを使用してデコードをします。
//・mapper.readValue(json, AddEntity.class);でjsonデコードできます。
package com.example.demo.Repository;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.example.demo.data.AddEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class GetApiRepository {
	public AddEntity callMethod() throws JsonMappingException, JsonProcessingException {
		String url = "https://umayadia-apisample.azurewebsites.net/api/persons";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> getApi = restTemplate.getForEntity(url, String.class);
		ResponseEntity<String> res = getApi;
		String json = res.getBody();
		ObjectMapper mapper = new ObjectMapper();
		AddEntity getJson = mapper.readValue(json, AddEntity.class);
		return getJson;
	}
}
