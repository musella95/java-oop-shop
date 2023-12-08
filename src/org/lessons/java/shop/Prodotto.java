package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
// 1 ATTRIBUTI
    private int code;
    private String name;
    private String description;
    private double price;
    private double iva;

// 2 COSTRUCTOR

    public Prodotto(String name, String description, double price, double iva) throws Exception{
        if (name == null || name.isBlank())	{
            throw new Exception("Nome non valido");
        }
        if (price<0){
            throw new Exception("Il prezzo non puo essere negativo");
        }
        if (iva<0){
            throw new Exception("L'iva  non puo essere negativa");
        }
        int min= 0;
        int max= 1000;
        this.code = min + (int)(Math.random() * ((max - min) + 1));
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }
// 3 GETTER E SETTER

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price)  {
        this.price = price;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) throws Exception {
        this.iva = iva;


    }

// 4 METODI DI UTILITA'

    public String fullName(){
        return code +" "+ name;
    }
    public String basePrice(){
        return name + " " + price+"$";
    }
    public double ivaPrice(){
        return iva * price / 100 + price;
    }
}
