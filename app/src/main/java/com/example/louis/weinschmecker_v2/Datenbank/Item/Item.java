package com.example.louis.weinschmecker_v2.Datenbank.Item;

/**
 * Created by louis on 21.12.2017.
 */

public class Item {

    String weinname;
    String jahrgang;
    String land;
    String preis;
    byte[] img;





    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }








    public String getPreis() {
        return preis;
    }

    public void setPreis(String preis) {
        this.preis = preis;
    }


    public String getWeinname() {
        return weinname;
    }

    public void setWeinname(String weinname) {
        this.weinname = weinname;
    }

    public String getJahrgang() {
        return jahrgang;
    }

    public void setJahrgang(String jahrgang) {
        this.jahrgang = jahrgang;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

}
