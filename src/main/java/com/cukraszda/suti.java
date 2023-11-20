package com.cukraszda;

public class suti {

    // suti tábla mezőinek
    public int id;
    public String nev;
    public String tipus;

    // tartalom tábla mezőinek
    public int t_id;
    public String tartalomNev;
    public int armin;
    public int armax;

    // reszlet tábla mezőinek
    public int sutidb;
    public int tartalomdb;




    public suti() {}



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public String getTartalomNev() {
        return tartalomNev;
    }

    public void setTartalomNev(String tartalomNev) {
        this.tartalomNev = tartalomNev;
    }

    public int getArmin() {
        return armin;
    }

    public void setArmin(int armin) {
        this.armin = armin;
    }

    public int getArmax() {
        return armax;
    }

    public void setArmax(int armax) {
        this.armax = armax;
    }

    public int getSutidb() {
        return sutidb;
    }

    public void setSutidb(int sutidb) {
        this.sutidb = sutidb;
    }

    public int getTartalomdb() {
        return tartalomdb;
    }

    public void setTartalomdb(int tartalomdb) {
        this.tartalomdb = tartalomdb;
    }

    public suti(int id, String nev, String tipus, int t_id, String tartalomNev, int armin, int armax, int sutidb, int tartalomdb) {
        this.id = id;
        this.nev = nev;
        this.tipus = tipus;
        this.t_id = t_id;
        this.tartalomNev = tartalomNev;
        this.armin = armin;
        this.armax = armax;
        this.sutidb = sutidb;
        this.tartalomdb = tartalomdb;

    }

}
