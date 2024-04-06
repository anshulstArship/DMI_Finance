package com.main.dmiFinance.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.main.dmiFinance.models.BureauData;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class JsonParser {
    public static BureauData parse(String jsonData) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(jsonData, BureauData.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
