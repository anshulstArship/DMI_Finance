package com.main.dmiFinance.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Name {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name1;
    private String dob;
    private String gender;
    @OneToOne(mappedBy = "name")
    private BureauData bureauData;
    @OneToOne
    @JoinColumn(name = "json_response_object_id") // Assuming there's a foreign key column named "json_response_object_id"
    private JsonResponseObject jsonResponseObject;

}
