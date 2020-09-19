package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Veuillir saisir 2 nombres : " );
        int facteur1 = Integer.parseInt(scanner.nextLine());
        int facteur2 = Integer.parseInt(scanner.nextLine());
        int produit = facteur1*facteur2;
        System.out.println("Le produit de vos 2 facteurs est : " + produit);
        System.out.print( "Veuillir saisir 2 nombres : " );
        int modulo1 = Integer.parseInt(scanner.nextLine());
        int modulo2 = Integer.parseInt(scanner.nextLine());
        int modulo3 = modulo1%modulo2;
        System.out.println("Le reste de vos 2 nombres est : " + modulo3);
        System.out.println( "Veuillir saisir 2 nombres : " );
        int diviseur1 = Integer.parseInt(scanner.nextLine());
        int divisieur2 = Integer.parseInt(scanner.nextLine());
        int division = diviseur1/divisieur2;
        System.out.println("La division de vos 2 nombres est : " + division);

    }
}
