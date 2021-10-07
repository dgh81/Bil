package com.company;

public class Hjul {
    int tommer;
    String navn;
    String dæktype; //helårsdæk etc.

    public Hjul(int tommer, String navn, String dæktype) {
        this.tommer = tommer;
        this.navn = navn;
        this.dæktype = dæktype;
    }

    @Override
    public String toString() {
        return "Hjul{" +
                "tommer=" + tommer +
                ", navn='" + navn + '\'' +
                ", dæktype='" + dæktype + '\'' +
                '}';
    }
    public int getTommer() {
        return tommer;
    }

    public void setTommer(int tommer) {
        this.tommer = tommer;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getDæktype() {
        return dæktype;
    }

    public void setDæktype(String dæktype) {
        this.dæktype = dæktype;
    }




}
