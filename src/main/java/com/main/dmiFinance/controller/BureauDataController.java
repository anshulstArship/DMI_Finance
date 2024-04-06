package com.main.dmiFinance.controller;

import com.main.dmiFinance.DTO.BureauDataDTO;
import com.main.dmiFinance.models.BureauData;
import com.main.dmiFinance.service.BureauDataService;
import com.main.dmiFinance.service.JsonParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BureauDataController {

    @Autowired
    private  BureauDataService bureauDataService;


    public void saveBureauData(@RequestBody String jsonData) {
        BureauData bureauData = JsonParser.parse(jsonData);
        bureauDataService.saveBureauData(bureauData);
    }
    @PostMapping("/bureau-data")
    public ResponseEntity<String> receiveBureauData(@RequestBody BureauDataDTO bureauDataDTO) {
        String jsonData = bureauDataDTO.getJsonData();
        BureauData bureauData = JsonParser.parse(jsonData);
        bureauDataService.saveBureauData(bureauData);


        return ResponseEntity.ok("Data received successfully");
    }
}
