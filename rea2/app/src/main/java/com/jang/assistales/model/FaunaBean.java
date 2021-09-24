package com.jang.assistales.model;

import java.io.Serializable;

public class FaunaBean implements Serializable {
    private String name;
    private String description;
    private String race;
    private String aggressive;
    private String attack;
    private String defence;
    private String intelligence;
    private String ability;
    private String agility;
    private boolean group;
    private String power;
    private String weakness;
    private boolean rarity;
    private String ear;
    private String muzzle;
    private String tail;
    private String fur;
    private String color;
    private String particularity;

    @Override
    public String toString() {
        return name;
    }

    //--------------------------Constructor---------------------------//

    public FaunaBean(String name) {
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

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getAggressive() {
        return aggressive;
    }

    public void setAggressive(String aggressive) {
        this.aggressive = aggressive;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getDefence() {
        return defence;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }

    public String getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(String intelligence) {
        this.intelligence = intelligence;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getAgility() {
        return agility;
    }

    public void setAgility(String agility) {
        this.agility = agility;
    }

    public boolean isGroup() {
        return group;
    }

    public void setGroup(boolean group) {
        this.group = group;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public boolean isRarity() {
        return rarity;
    }

    public void setRarity(boolean rarity) {
        this.rarity = rarity;
    }

    public String getEar() {
        return ear;
    }

    public void setEar(String ear) {
        this.ear = ear;
    }

    public String getMuzzle() {
        return muzzle;
    }

    public void setMuzzle(String muzzle) {
        this.muzzle = muzzle;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getParticularity() {
        return particularity;
    }

    public void setParticularity(String particularity) {
        this.particularity = particularity;
    }
}
