package com.jang.assistales.model;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.io.Serializable;
import java.util.ArrayList;

@Entity(foreignKeys = @ForeignKey(entity = UniversBean.class, parentColumns = "id_univers", childColumns = "universId"))
public class FloraBean implements Serializable {
    @PrimaryKey
    private long id_flora;
    private String name;
    private String story;
    private String looks;
    private boolean rarity;
    private String benefit;
    private String danger;
    private String specific;
    private ArrayList<PlaceBean> lieux;
    private UniversBean univers;
    private long universId;

    @Override
    public String toString() {
        return name;
    }

    //--------------------------Constructor---------------------------//

    public FloraBean(String name) {
        this.name = name;
    }


    //--------------------------Getter/Setter-------------------------//


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getLooks() {
        return looks;
    }

    public void setLooks(String looks) {
        this.looks = looks;
    }

    public boolean isRarity() {
        return rarity;
    }

    public void setRarity(boolean rarity) {
        this.rarity = rarity;
    }

    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }

    public String getDanger() {
        return danger;
    }

    public void setDanger(String danger) {
        this.danger = danger;
    }

    public String getSpecific() {
        return specific;
    }

    public void setSpecific(String specific) {
        this.specific = specific;
    }

    public ArrayList<PlaceBean> getLieux() {
        return lieux;
    }

    public void setLieux(ArrayList<PlaceBean> lieux) {
        this.lieux = lieux;
    }

    public UniversBean getUnivers() {
        return univers;
    }

    public void setUnivers(UniversBean univers) {
        this.univers = univers;
    }
}
