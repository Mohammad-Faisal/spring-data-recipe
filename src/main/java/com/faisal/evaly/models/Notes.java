package com.faisal.evaly.models;

import javax.persistence.*;

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // we may have many generation policies
    private Long id;

    @OneToOne // this is not the owner so we dont want to give it the cascade operation.
    // that means if notes is deleted we may not want to delete the recipe object associated with it .
    // that means the recipe object is the owner here
    private Recipe recipe;

    @Lob //to allow large strings larger than 256
    private String recipeNote;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecipeNote() {
        return recipeNote;
    }

    public void setRecipeNote(String recipeNote) {
        this.recipeNote = recipeNote;
    }



}
