package com.company;

public class cilindru {
    private double raza;
    private double inaltime;

    public cilindru(double raza,double inaltime){
        this.raza=raza;
        this.inaltime=inaltime;
    }
    public double calculeazaSuprafata(){
        return 2*Math.PI*raza*(raza+inaltime);
    }
    public double calculezaVolumul(){
        return Math.PI*Math.pow(raza,2)*inaltime;
    }
    public String toString(){
        return "com.company.cilindru cu raza"+raza+"inaltimea";
    }
}
