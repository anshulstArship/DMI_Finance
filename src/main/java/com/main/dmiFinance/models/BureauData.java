package com.main.dmiFinance.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class BureauData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Address> addressList;

    @OneToOne(cascade = CascadeType.ALL)
    private Name name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<IdList> idList;

    @OneToOne(cascade = CascadeType.ALL)
    private Header header;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Score> scoreList;

    private String bureau;
    private int trackingId;
    private String product;
    private String status;
    private String bureauString;
}
