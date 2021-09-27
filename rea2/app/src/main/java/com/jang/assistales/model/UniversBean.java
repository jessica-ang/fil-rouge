package com.jang.assistales.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class UniversBean implements Serializable {
    @PrimaryKey(autoGenerate = true)
    private long id_univers;
    private String name;

    @Override
    public String toString() {
        return name;
    }

    //--------------------------Constructor---------------------------//

    public UniversBean(String name) {
        this.name = name;
    }


    //--------------------------Getter/Setter-------------------------//


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
