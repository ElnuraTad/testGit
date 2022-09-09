package com.peaksoft;

public class Autobaza {

    private int id;
    private String adress;

    public Autobaza(int id, String adress) {
        this.id = id;
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Autobaza{" +
                "id=" + id +
                ", adress='" + adress + '\'' +
                '}';
    }
}
