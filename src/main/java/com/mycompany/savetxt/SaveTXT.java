/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.savetxt;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author Armando
 */
public class SaveTXT {
    public static void main(String[] args) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("filename.txt");
            while (true) {
                System.out.println("Introduce el código del medicamento: ");
                Scanner codigo = new Scanner(System.in);
                String codigoString = codigo.next();
                writer.println("Código: " + codigoString);
                System.out.println("Introduce el precio del medicamento: ");
                Scanner precio = new Scanner(System.in);
                String precioString = precio.next();
                writer.println("Precio: " + precioString);
                System.out.println("Introduce la descripción del medicamento: ");
                Scanner descripcion = new Scanner(System.in);
                String descripcionString = descripcion.nextLine();
                writer.println("Descripción: " + descripcionString);
                System.out.println("¿Desea continuar (Y/N)?: ");
                Scanner inputContinuar = new Scanner(System.in);
                String isYORN = inputContinuar.next();
                if (isYORN.equals("N")) {
                    break;
                }
            }
            writer.close();
        } catch(FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
