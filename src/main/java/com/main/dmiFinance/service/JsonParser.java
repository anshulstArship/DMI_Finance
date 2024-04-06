package com.main.dmiFinance.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.main.dmiFinance.models.BureauData;
import com.main.dmiFinance.models.BureauDataWrapper;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class JsonParser {
    public static BureauData parse(String jsonData) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            BureauDataWrapper bureauDataWrapper = objectMapper.readValue(jsonData, BureauDataWrapper.class);

            // Extract the inner JSON response object
            BureauData bureauData = bureauDataWrapper.getJsonResponseObject();

            // Return the parsed data
            return bureauData;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error occurred while parsing JSON: " + e.getMessage());
            return null;
        }
    }
}


