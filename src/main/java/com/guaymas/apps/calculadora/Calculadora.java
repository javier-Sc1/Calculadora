/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.guaymas.apps.calculadora;

/**
 *
 * @author javier
 */
public class Calculadora {

    public static void main(String[] args) {
    Persona personita = new Persona();
    personita.setNombre("Viveros Zavala Angel");
    personita.setFechaNacimiento("04/12/2002");
    personita.setEntidadNacimiento("DF");
  //  personita.setSexoNacimiento("H");
        System.out.println(personita.obtenerCurp());
    }
}
