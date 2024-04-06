package com.main.dmiFinance.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BureauDataWrapper {
    @JsonProperty("JSON-RESPONSE-OBJECT")
    private BureauData jsonResponseObject;

    public BureauData getJsonResponseObject() {
        return jsonResponseObject;
    }

    public void setJsonResponseObject(BureauData jsonResponseObject) {
        this.jsonResponseObject = jsonResponseObject;
    }
}
