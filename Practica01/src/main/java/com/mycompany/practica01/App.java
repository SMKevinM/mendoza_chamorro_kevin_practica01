package com.mycompany;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Ingrese los datos del usuario:");
        System.out.print("Apellido Paterno: ");
        String paterno = scanner.nextLine();
        System.out.print("Apellido Materno: ");
        String materno = scanner.nextLine();
        System.out.print("Nombres: ");
        String nombres = scanner.nextLine();
        System.out.print("Documento: ");
        String documento = scanner.nextLine();
        System.out.print("Tipo de Documento: ");
        String tipoDocumento = scanner.nextLine();

        Usuario usuario = new Usuario(paterno, materno, nombres, documento, tipoDocumento);

        System.out.println("\nIngrese los datos de la tarjeta:");
        System.out.print("Número de la tarjeta: ");
        int numero = scanner.nextInt();
        System.out.print("Saldo inicial: ");
        float saldo = scanner.nextFloat();
        System.out.print("¿Está activa la tarjeta? (true/false): ");
        boolean activo = scanner.nextBoolean();
        System.out.print("Precio por consumo: ");
        float precio = scanner.nextFloat();

        Tarjeta tarjeta = new Tarjeta(numero, saldo, activo, precio);

        
        System.out.print("\nIngrese el monto a recargar: ");
        float monto = scanner.nextFloat();
        usuario.recargar(tarjeta, monto);

      
        System.out.println("\nIntentando consumir de la tarjeta...");
        usuario.consumir(tarjeta);

      
        System.out.println("Saldo final de la tarjeta: " + tarjeta.getSaldo());

        scanner.close();
    }
}
