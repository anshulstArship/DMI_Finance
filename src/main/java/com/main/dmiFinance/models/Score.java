package com.main.dmiFinance.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String scoreName;
    private String scoreCardName;
    private String scoreCardVersion;
    private String scoreDate;
    private String score;
    @ManyToOne
    private BureauData bureauData;
    @ManyToOne
    @JoinColumn(name = "json_response_object_id") // Assuming there's a foreign key column named "json_response_object_id"
    private JsonResponseObject jsonResponseObject;
}
