package com.faisal.evaly.models;

import javax.persistence.*;
import java.util.Set;


@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Integer prepTime;
    private String source;

    @Lob //this is for large objects to allow them to be stored
    private Byte[] image;

    @Enumerated(value = EnumType.STRING) // we could use the ENumType.ORDINAL
    // that would store the values as 1, 2, 3, ,4  which is risky becaues it depends on the serial
    private Difficulty difficulty;

    @OneToOne(cascade =  CascadeType.ALL) //deleting Recipe will delete the Notes also
    private Notes notes;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "recipe")

    private Set<Ingredient> ingredients;




    //for creating many to many relationship
    @ManyToMany
    @JoinTable(name = "recipe_category" ,
            joinColumns = @JoinColumn(name= "recipe_id") ,
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories;


    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }


    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(Integer prepTime) {
        this.prepTime = prepTime;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
