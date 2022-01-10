package com.company;

import java.util.Objects;

public class Temperatur {
    private int wert;
    private String masseinheit;
    private String monat;

    public Temperatur(int wert, String masseinheit, String monat) {
        this.wert = wert;
        this.masseinheit = masseinheit;
        this.monat = monat;
    }

    public int getWert() {
        return wert;
    }

    public void setWert(int wert) {
        this.wert = wert;
    }

    public String getMasseinheit() {
        return masseinheit;
    }

    public void setMasseinheit(String masseinheit) {
        this.masseinheit = masseinheit;
    }

    public String getMonat() {
        return monat;
    }

    public void setMonat(String monat) {
        this.monat = monat;
    }

    @Override
    public String toString() {
        return "Temperatur{" +
                "wert=" + wert +
                ", masseinheit='" + masseinheit + '\'' +
                ", monat='" + monat + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Temperatur)) return false;
        Temperatur that = (Temperatur) o;
        return getWert() == that.getWert() && Objects.equals(getMasseinheit(), that.getMasseinheit()) && Objects.equals(getMonat(), that.getMonat());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWert(), getMasseinheit(), getMonat());
    }
}
