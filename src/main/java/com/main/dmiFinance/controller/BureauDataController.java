package com.main.dmiFinance.controller;

import com.main.dmiFinance.models.BureauData;
import com.main.dmiFinance.service.BureauDataService;
import com.main.dmiFinance.service.JsonParser;
import org.springframework.beans.factory.annotation.Autowired;
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
}
