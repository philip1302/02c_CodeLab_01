package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    
        Konto konto1=new Konto(10000);
        Konto konto2=new Konto(10000);
        Konto konto3=new Konto(10000);

        output(Integer.toString(konto1.getKontostand()));
        output(Integer.toString(konto2.getKontostand()));
        output(Integer.toString(konto3.getKontostand()));

        konto1.setKontostand(konto1.getKontostand()*2);
        konto2.setKontostand(konto2.getKontostand()*3);
        konto3.setKontostand(konto3.getKontostand()*10);

        output(Integer.toString(konto1.getKontostand()));
        output(Integer.toString(konto2.getKontostand()));
        output(Integer.toString(konto3.getKontostand()));

        
    }


    private static void output(String outputStr) {
        System.out.println(outputStr);
    } 

}