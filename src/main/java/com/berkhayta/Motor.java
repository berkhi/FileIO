package com.berkhayta;

import java.io.Serializable;

public class Motor implements Serializable {
    private String motorAd;
    private int saseNo;

    public Motor(String motorAd, int saseNo) {
        this.motorAd = motorAd;
        this.saseNo = saseNo;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "motorAd='" + motorAd + '\'' +
                ", saseNo=" + saseNo +
                '}';
    }

    public String getMotorAd() {
        return motorAd;
    }

    public void setMotorAd(String motorAd) {
        this.motorAd = motorAd;
    }

    public int getSaseNo() {
        return saseNo;
    }

    public void setSaseNo(int saseNo) {
        this.saseNo = saseNo;
    }
}
