package com.company;

public class Main {

    public static void main(String[] args) {
        cilindru c1=new cilindru (5,10);
        cilindru c2=new cilindru (6,10);

        System.out.println(c1);
        System.out.printf("Aria c1 %.2f\n",c1.calculeazaSuprafata());
        System.out.println(c2);
        System.out.printf("Volum c2%.2f\n",c2.calculezaVolumul());



    }

}
