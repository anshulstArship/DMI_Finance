package com.main.dmiFinance.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class JsonResponseObject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "jsonResponseObject")
    private List<Address> addressList;

    @OneToOne
    private Header header;
    @OneToMany(mappedBy = "jsonResponseObject", cascade = CascadeType.ALL)
    private List<IdList> idList;
    @OneToOne(mappedBy = "jsonResponseObject", cascade = CascadeType.ALL)
    private Name name;
    @OneToMany(mappedBy = "jsonResponseObject", cascade = CascadeType.ALL)
    private List<Score> scoreList;
}
