package com.main.dmiFinance.DTO;

public class BureauDataDTO {
    private String jsonData;

    public BureauDataDTO() {
    }

    public BureauDataDTO(String jsonData) {
        this.jsonData = jsonData;
    }

    public String getJsonData() {
        return jsonData;
    }

    public void setJsonData(String jsonData) {
        this.jsonData = jsonData;
    }
}
