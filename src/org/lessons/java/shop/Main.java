package org.lessons.java.shop;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
     try {
      System.out.println("nome del prodotto");
      String nomeProdotto=scanner.nextLine();
      System.out.println("prezzo del prodotto");
      double prezzoProdotto=Double.parseDouble(scanner.nextLine());
      System.out.println("iva del prodotto");
      double prezzoIva=Double.parseDouble(scanner.nextLine());
      System.out.println("descrizione del prodotto");
      String descrizioneProdotto=scanner.nextLine();
   Prodotto nuovoProdotto= new Prodotto(nomeProdotto,descrizioneProdotto,prezzoProdotto,prezzoIva);
      System.out.println(nuovoProdotto.fullName());
      System.out.println(nuovoProdotto.ivaPrice());
      System.out.println(nuovoProdotto.basePrice());

     }catch (Exception e){
      System.out.println(e.getMessage());
     } finally {

      scanner.close();
     }
    }
}
