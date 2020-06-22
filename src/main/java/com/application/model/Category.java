package com.application.model;

import com.application.config.JsonPropertyView;
import com.fasterxml.jackson.annotation.JsonView;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(JsonPropertyView.Category.class)
    private int id;

    @JsonView(JsonPropertyView.Category.class)
    private String type;

    @OneToMany(mappedBy = "category",fetch = FetchType.EAGER)
    private List<Product> products;

    public Category(){

    }

    public Category(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
