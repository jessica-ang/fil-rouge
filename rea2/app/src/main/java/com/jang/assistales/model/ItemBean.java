package com.jang.assistales.model;

public class ItemBean extends SheetBean {
    private String name;
    private String descritpion;
    private String gender;
    private String weight;
    private String size;
    private String other;
    private String creationDate;
    private String origin;
    private String past;
    private String present;
    private String utility;
    private String capacity;


    //--------------------------Constructor---------------------------//

    public ItemBean(String name) {
        super(name);
        this.name = name;
    }


    //--------------------------Getter/Setter-------------------------//


}
