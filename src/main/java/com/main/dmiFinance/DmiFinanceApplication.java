package com.main.dmiFinance;

import com.fasterxml.jackson.databind.util.JSONPObject;


import com.main.dmiFinance.DTO.BureauDataDTO;
import com.main.dmiFinance.Data.SampleData;
import com.main.dmiFinance.controller.BureauDataController;
import com.sun.tools.javac.Main;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Iterator;

@SpringBootApplication
public class DmiFinanceApplication implements CommandLineRunner {
	@Autowired
	BureauDataController controller;

	String jsonData = "{\n" +
			"  \"JSON-RESPONSE-OBJECT\": {\n" +
			"    \"addressList\": [\n" +
			"      {\n" +
			"        \"addressLine1\": \"C/O: JAHANGIR KHAN,DSECTOR,LLINE,ROOM,\",\n" +
			"        \"addressLine2\": \"NO826,CHEETA CAMP,TROMBAY,NEAR APNA\",\n" +
			"        \"addressLine3\": \"HOTEL\",\n" +
			"        \"stateCode\": \"27\",\n" +
			"        \"pinCode\": \"400088\",\n" +
			"        \"addressCategory\": \"02\",\n" +
			"        \"dateReported\": \"05042024\",\n" +
			"        \"enrichedThroughEnquiry\": \"Y\"\n" +
			"      }\n" +
			"    ],\n" +
			"    \"name\": {\n" +
			"      \"name1\": \"KAJAL BILAL LAMBE\",\n" +
			"      \"dob\": \"25101998\",\n" +
			"      \"gender\": \"1\"\n" +
			"    },\n" +
			"    \"idList\": [\n" +
			"      {\n" +
			"        \"idType\": \"01\",\n" +
			"        \"idValue\": \"KVTPK1963E\",\n" +
			"        \"enrichedThroughEnquiry\": \"Y\"\n" +
			"      }\n" +
			"    ],\n" +
			"    \"header\": {\n" +
			"      \"version\": \"12\",\n" +
			"      \"memberReferenceNumber\": \" 0000NB66831003_\",\n" +
			"      \"enquiryMemberUserID\": \"NB66831003_CIRC2C \",\n" +
			"      \"subjectReturnCode\": \"0\",\n" +
			"      \"enquiryControlNumber\": \"007400403854\",\n" +
			"      \"dateProceed\": \"05042024\",\n" +
			"      \"timeProceed\": \"141855\"\n" +
			"    },\n" +
			"    \"scoreList\": [\n" +
			"      {\n" +
			"        \"scoreName\": \"CIBILTUSC3\",\n" +
			"        \"scoreCardName\": \"08\",\n" +
			"        \"scoreCardVersion\": \"10\",\n" +
			"        \"scoreDate\": \"05042024\",\n" +
			"        \"score\": \"000-1\"\n" +
			"      }\n" +
			"    ]\n" +
			"  },\n" +
			"  \"BUREAU\": \"CIBIL\",\n" +
			"  \"TRACKING-ID\": 58322332,\n" +
			"  \"PRODUCT\": \"CIR\",\n" +
			"  \"STATUS\": \"SUCCESS\",\n" +
			"  \"BUREAU-STRING\": \"TUEF12 0000NB66831003_CIRC2C 000740040385405042024141855PN03N010117KAJAL BILAL LAMBE07082510199808011ID03I010102010210KVTPK1963E9001YSC10CIBILTUSC30102080202100308050420240405000-1PA03A010138C/O: JAHANGIR KHAN,DSECTOR,LLINE,ROOM,0235NO826,CHEETA CAMP,TROMBAY,NEAR APNA0305HOTEL06022707064000880802021008050420249001YES0700003710102**\\u0013\"\n" +
			"}";
	
	static String jsonData2 = SampleData.jsonData2;

	public static void main(String[] args) {
		SpringApplication.run(DmiFinanceApplication.class, args);
		BureauDataDTO bureauDataDTO = new BureauDataDTO();
		bureauDataDTO.setJsonData(jsonData2);

		// POST request to the endpoint
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/bureau-data";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> request = new HttpEntity<>(jsonData2, headers);

		// Send POST request
		ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);


		//response received from the endpoint
		System.out.println("Response status: " + response.getStatusCode());
		System.out.println("Response body: " + response.getBody());




	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Saving Data ");
		//controller.saveBureauData(jsonData2);

	}
}
