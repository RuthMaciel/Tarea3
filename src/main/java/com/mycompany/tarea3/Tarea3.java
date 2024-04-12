/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea3;

/**
 *
 * @author ruthm
 */
public class Tarea3 {

    public static void main(String[] args) { 
        
     // Crear un array de empleados con su nombre, número de cédula y salario
        String[][] empleados = {
            {"Juan", "1234567", "1000"},
            {"Maria", "8912345", "1200"},
            {"Pedro", "6789123", "900"}
        };

        // Número de cédula a buscar
        String cedulaABuscar = "1234567";
        // Cantidad de horas trabajadas
        int horasTrabajadas = 30;

        boolean empleadoEncontrado = false;
        double salarioTotal = 0;

        // Buscar al empleado por número de cédula
        for (String[] empleado : empleados) {
            if (empleado[1].equals(cedulaABuscar)) {
                empleadoEncontrado = true;
                double salario = Double.parseDouble(empleado[2]);
                salarioTotal = salario * horasTrabajadas;
                break;
            }
        }

        // Verificar si el empleado fue encontrado
        if (empleadoEncontrado) {
            System.out.println("El salario total del empleado es: Gs" + salarioTotal);
        } else {
            System.out.println("El empleado no existe");
        }
    }
}
    

