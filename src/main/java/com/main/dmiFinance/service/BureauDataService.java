package com.main.dmiFinance.service;

import com.main.dmiFinance.models.BureauData;
import com.main.dmiFinance.repositories.BureauDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BureauDataService {

    @Autowired
    private BureauDataRepository bureauDataRepository;



    public void saveBureauData(BureauData bureauData) {
        bureauDataRepository.save(bureauData);
    }
}
