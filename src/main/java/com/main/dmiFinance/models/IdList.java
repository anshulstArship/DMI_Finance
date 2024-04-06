package com.main.dmiFinance.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class IdList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String idType;
    private String idValue;
    private String enrichedThroughEnquiry;
    @ManyToOne
    private BureauData bureauData;
    @ManyToOne
    @JoinColumn(name = "json_response_object_id") // Assuming there's a foreign key column named "json_response_object_id"
    private JsonResponseObject jsonResponseObject;
}
