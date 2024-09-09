package com.mycompany.practica01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear un objeto de Tarjeta
        Tarjeta tarjeta = new Tarjeta(123456, 100.0f, true, 50.0f);

        // Crear un objeto de Usuario
        Usuario usuario = new Usuario("Perez", "Lopez", "Juan", "12345678", "DNI");

        // Mostrar información inicial
        System.out.println("Usuario: " + usuario.getNombres() + " " + usuario.getPaterno());
        System.out.println("Saldo inicial: " + tarjeta.getSaldo());

        // Simular recarga
        System.out.print("Ingrese monto a recargar: ");
        float monto = sc.nextFloat();
        if (tarjeta.recargar(monto)) {
            System.out.println("Recarga exitosa. Nuevo saldo: " + tarjeta.getSaldo());
        } else {
            System.out.println("Recarga fallida.");
        }

        // Simular consumo
        if (tarjeta.consumir()) {
            System.out.println("Consumo exitoso. Nuevo saldo: " + tarjeta.getSaldo());
        } else {
            System.out.println("No hay saldo suficiente o la tarjeta está inactiva.");
        }

        sc.close();
    }
}
