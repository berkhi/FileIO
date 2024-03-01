package com.berkhayta;

import java.io.Serializable;

public class Otomobil implements Serializable {

    private static final long serialVersionUID=1L;

    private String marka;
    private String model;
    private Integer yil;
    private String renk;
    private Motor motor;

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Otomobil(String marka, String model, Integer yil, String renk, Motor motor) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.renk = renk;
        this.motor = motor;
    }

    public Otomobil(String marka, String model, Integer yil) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }

    @Override
    public String toString() {
        return "Otomobil{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                '}';
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYil() {
        return yil;
    }

    public void setYil(Integer yil) {
        this.yil = yil;
    }
}
