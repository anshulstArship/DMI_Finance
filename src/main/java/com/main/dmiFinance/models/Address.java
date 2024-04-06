package com.main.dmiFinance.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;



@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("addressLine1")
    private String addressLine1;
    @ManyToOne
    @JoinColumn(name = "json_response_object_id")
    private JsonResponseObject jsonResponseObject;

    @JsonProperty("addressLine2")
    private String addressLine2;

    @JsonProperty("addressLine3")
    private String addressLine3;

    @JsonProperty("stateCode") // Assuming state code is a 2-character string
    private String stateCode;

    @JsonProperty("pinCode") // Assuming pin code is a 10-character string
    private String pinCode;

    @JsonProperty("addressCategory") // Assuming address category is a 2-character string
    private String addressCategory;

    @JsonProperty("dateReported")
    private String dateReported;

    @JsonProperty("enrichedThroughEnquiry")
    private String enrichedThroughEnquiry;
    @ManyToOne
    private BureauData bureauData;
}
