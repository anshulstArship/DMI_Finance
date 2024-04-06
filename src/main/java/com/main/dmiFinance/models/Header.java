package com.main.dmiFinance.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Header {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String version;
    private String memberReferenceNumber;
    private String enquiryMemberUserID;
    private String subjectReturnCode;
    private String enquiryControlNumber;
    private String dateProceed;
    private String timeProceed;

    @OneToOne(mappedBy = "header", cascade = CascadeType.ALL)
    @JoinColumn(name = "bureau_data_id")
    private BureauData bureauData;
    @OneToOne(mappedBy = "header", cascade = CascadeType.ALL)
    private JsonResponseObject jsonResponseObject;

}
