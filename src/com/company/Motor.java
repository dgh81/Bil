package com.company;

public class Motor {
    int hestekræfter;
    int liter;
    boolean elbil;

    public Motor(int hestekræfter, int liter, boolean elbil) {
        this.hestekræfter = hestekræfter;
        this.liter = liter;
        this.elbil = elbil;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "hestekræfter=" + hestekræfter +
                ", liter=" + liter +
                ", elbil=" + elbil +
                '}';
    }
    public int getHestekræfter() {
        return hestekræfter;
    }

    public void setHestekræfter(int hestekræfter) {
        this.hestekræfter = hestekræfter;
    }

    public int getLiter() {
        return liter;
    }

    public void setLiter(int liter) {
        this.liter = liter;
    }

    public boolean isElbil() {
        return elbil;
    }

    public void setElbil(boolean elbil) {
        this.elbil = elbil;
    }
}
