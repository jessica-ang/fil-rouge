package com.jang.assistales.model;

import java.io.Serializable;

public class ProjectBean implements Serializable {
    private String name;
    private String description;
    private String storyline;

    @Override
    public String toString() {
        return name;
    }

    //--------------------------Constructor---------------------------//
    public ProjectBean(String name) {
        this.name = name;
    }

    //--------------------------Getter/Setter-------------------------//


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStoryline() {
        return storyline;
    }

    public void setStoryline(String storyline) {
        this.storyline = storyline;
    }
}
