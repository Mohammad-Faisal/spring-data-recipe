package com.faisal.evaly.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Unit {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // we may have many generation policies
    private Long id;


    private String description;


}
