package com.jang.assistales.model;

import java.io.Serializable;

public class UniversBean implements Serializable {
    private String name;

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
