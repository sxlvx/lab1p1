package com.mycompany.lab1_p1_salvadormacias;

import java.util.Scanner;

public class Lab1_p1_salvadormacias {

    public static Scanner lea = new Scanner(System.in);
    public static Scanner str = new Scanner(System.in);

    public static void main(String[] args) {
        boolean abandonar = false;
        do {
            System.out.println("Bienvenido al menu!");
            System.out.println("Las opciones disponibles del menu son: ");
            System.out.println("1.Socios\n2.Determinar mayor\n3.Triangulo o no\n4.Salir");
            System.out.println("Ingrese una opcion disponible: ");
            int opcion = lea.nextInt();
            if (opcion == 1) {
                boolean resp = true;
                do {
                    int grado;
                    double total = 0.0;
                    System.out.println("Ingrese el grado del socio: ");
                    grado = lea.nextInt();
                    System.out.println("Ingrese el total de la compra: ");
                    total = lea.nextFloat();
                    if (grado == 0) {
                        total = total;

                    }//fin grado 0
                    else if (grado == 1) {
                        total = total * 0.9;

                    } else if (grado == 2) {
                        total = total * 0.85;

                    } else if (grado == 3) {
                        total = total * 0.75;

                    } else {
                        System.out.println("Grado ingresado invalido ");
                    }

                    System.out.println("el total a pagar es: " + total + " Lps");
                    System.out.println("Desea calcular otro cliente [s/n]: ");
                    String resp1 = str.nextLine();
                    if (resp1.contentEquals("n")) {
                        resp = false;
                    }

                } while (resp != false);

            }//fin opcion1
            
            else if (opcion == 2) {
            boolean num = true;
            int n1;
            int mayor=0;
            do {
            System.out.println("Ingrese un numero: ");
            n1 = lea.nextInt();
            System.out.println("Desea ingresar otro numero [s/n]: ");
            String resp1 = str.nextLine();
                    if (resp1.contentEquals("n")) {
                        num = false;
                    }
            if (n1 > n1) {
                n1=mayor;
            }
            
        } while (num != false);
        System.out.println("El mayor de los numeros es: " + n1);
            }//fin opcion2
            
            
            else if (opcion == 3) {
                boolean resp =true;
                do{
                    System.out.println("Ingrese a: ");
                    int a =lea.nextInt();
                    System.out.println("Ingrese b: ");
                    int b =lea.nextInt();
                    System.out.println("Ingrese c: ");
                    int c =lea.nextInt();
                    if((a<b+c)&&(b<a+c)&&(c<b+a))
                        System.out.println("Los lados ingresados si forman un triangulo ");
                    else{
                        System.out.println("Los lados ingresados no forman un triangulo");
                    }
                    System.out.println("Desea ingresar otras longitudes:[s/n]: ");
                    String resp1 = str.nextLine();
                    if (resp1.contentEquals("n")) {
                        resp = false;
                    }
                
                
                }while(resp!=false);

            }//fin opcion3
            else if (opcion == 4) {

                abandonar = true;

            }

        } while (abandonar
                != true);//fin while

    }//fin main

}//fin clase
