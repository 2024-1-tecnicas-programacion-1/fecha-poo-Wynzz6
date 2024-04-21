package com.mycompany.fecha.poo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el día:");
        int dia = scanner.nextInt();

        System.out.println("Ingrese el mes:");
        int mes = scanner.nextInt();

        System.out.println("Ingrese el año:");
        int ano = scanner.nextInt();

        Fecha fecha = new Fecha(dia, mes, ano);

        if (fecha.validarFecha()) {
            System.out.println("La fecha es válida.");
            System.out.println("Formato de fecha larga: " + fecha.fechaLarga());
        } else {
            System.out.println("La fecha no es válida.");
        }

        scanner.close();
    }
}
        
        
         }
  
}
