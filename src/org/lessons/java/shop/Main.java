package org.lessons.java.shop;



public class Main {
    public static void main(String[] args) {
       Prodotto product1 = new Prodotto("scaldacollo","fatto in lana", 22, 24);
        System.out.println(product1.fullName());
        System.out.println(product1.basePrice());
        System.out.println("il prezzo compreso d'iva è: ");
        System.out.print(product1.ivaPrice());
        Prodotto product2 = new Prodotto("cappello","fatto in lana merinos", 10, 24);
        System.out.println(product2.fullName());
        System.out.println(product2.basePrice());
        System.out.println("il prezzo compreso d'iva è: ");
        System.out.print(product2.ivaPrice());
        Prodotto product3 = new Prodotto("guanti","fatti in pelle di vitello", 30, 24);
        System.out.println(product3.fullName());
        System.out.println(product3.basePrice());
        System.out.println("il prezzo compreso d'iva è: ");
        System.out.print(product3.ivaPrice());
    }
}
