package com.main.dmiFinance.models;


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

    @Column(length = 255) // Adjust the length as per your requirement
    private String addressLine1;
    @ManyToOne
    @JoinColumn(name = "json_response_object_id")
    private JsonResponseObject jsonResponseObject;

    @Column(length = 255)
    private String addressLine2;

    @Column(length = 255)
    private String addressLine3;

    @Column(length = 2) // Assuming state code is a 2-character string
    private String stateCode;

    @Column(length = 10) // Assuming pin code is a 10-character string
    private String pinCode;

    @Column(length = 2) // Assuming address category is a 2-character string
    private String addressCategory;

    private String dateReported;
    private String enrichedThroughEnquiry;
    @ManyToOne
    private BureauData bureauData;
}
