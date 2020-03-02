package com.faisal.evaly.models;

import javax.persistence.*;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // we may have many generation policies
    private Long id;


    private String desc;
    private Integer amount;


    @OneToOne(fetch = FetchType.EAGER) //we want that loaded everytime with the object.
    //with FetchType.LAZY the data will be loaded only when the .getList() method is called . i
    // it is preferred when there is a large list to fetch . by default the FetchType is Eager
    private Unit unitOfMeasure;

    @ManyToOne
    private Recipe recipe;


    public Unit getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(Unit unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }


}
