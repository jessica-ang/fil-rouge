package com.jang.assistales.model;

public class ProjectBean extends SheetBean {
    private String name;
    private String description;
    private String storyline;

    //--------------------------Constructor---------------------------//
    public ProjectBean(String name) {
        super(name);
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
