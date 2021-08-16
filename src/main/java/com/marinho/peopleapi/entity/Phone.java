package com.marinho.peopleapi.entity;

import com.marinho.peopleapi.enums.PhoneType;
import lombok.Builder;
import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Data
@Builder
@Entity
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;
    @Column(nullable = false)
    private String number;
}
