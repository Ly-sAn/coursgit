package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print( "Veuillir saisir 2 nombres : " );
        int facteur1 = Integer.parseInt(scanner.nextLine());
        int facteur2 = Integer.parseInt(scanner.nextLine());
        int produit = facteur1*facteur2;
        System.out.println("Le produit de vos 2 facteurs est : " + produit);

    }
}
