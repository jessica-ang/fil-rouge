package com.jang.assistales.model;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(foreignKeys = @ForeignKey(entity = UniversBean.class, parentColumns = "id_univers", childColumns = "universId"))
public class PlaceBean implements Serializable {
    @PrimaryKey(autoGenerate = true)
    private long id_place;
    private String name;
    private String description;
    private String gender;
    private boolean deserted;
    private String landscape;
    private String smell;
    private String sound;
    private String culture;
    private String location;
    private String climate;
    private String landmark;
    private long universId;


    @Override
    public String toString() {
        return name;
    }

    //--------------------------Constructor---------------------------//

    public PlaceBean(String name) {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isDeserted() {
        return deserted;
    }

    public void setDeserted(boolean deserted) {
        this.deserted = deserted;
    }

    public String getLandscape() {
        return landscape;
    }

    public void setLandscape(String landscape) {
        this.landscape = landscape;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getCulture() {
        return culture;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }
}
