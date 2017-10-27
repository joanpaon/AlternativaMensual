package org.japo.java.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Instancia un objeto Scanner
        Scanner scn = new Scanner(System.in, "ISO-8859-1");

        // Variables de trabajo
        int diasMes;
        int mes;
        int any;

        try {
            // Introducir número de mes
            System.out.print("Mes de la fecha ...: ");
            mes = scn.nextInt();
            scn.nextLine();

            // Calcular dias del mes
            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    diasMes = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    diasMes = 30;
                    break;
                case 2:
                    // Introducir año
                    System.out.print("Año de la fecha ...: ");
                    any = scn.nextInt();
                    scn.nextLine();

                    // Considerar año bisiesto
                    if (any % 400 == 0 || any % 100 != 0 && any % 4 == 0) {
                        diasMes = 29;
                    } else {
                        diasMes = 28;
                    }
                    break;
                default:
                    throw new Exception();
            }

            // Resultado
            System.out.printf("El mes %2d tiene ...: %d dias\n", mes, diasMes);
        } catch (Exception e) {
            System.out.println(">>> Error de entrada");
        }
    }
}
