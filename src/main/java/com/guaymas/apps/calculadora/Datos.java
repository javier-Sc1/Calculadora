 
package com.guaymas.apps.calculadora;

import java.util.Scanner;

 
public class Datos {
    /**Nombre completo empezando por el apellido paterno*/
    private String nombre;
    /**Fecha de nacimiento en formato dia/mes/año*/
    private String fechaNacimiento;
    /**H pra hombre y M para mujer*/
    private String sexoNacimiento;
    /**Dos letras que corresponde a la entidad federeativa de nacimiento*/
    private String entidadNacimiento;
    
    
    /**Constructor vacio, no recibe nada*/
    public Datos(){
       
    }
    /**Metodo que toma los datos de la persona y obtiene lso primero*/
    public String obtenerCurp(){
        // Suponiendo que ingresa "ApellidoP ApellidoM Nombre"
        nombre = nombre.toUpperCase();
        String [] nombreSeparado = nombre.split(" ");
        //Primera letra de paterno
        String curp = nombreSeparado[0].substring(0,1);
        //Primera vocal
        for(int i = 1; i<nombreSeparado[0].length(); i++) { 
            if (nombreSeparado[0].substring(i,i+i).compareTo("A")==0 ||
                    nombreSeparado[0].substring(i,i+i).compareTo("E")==0 ||
                    nombreSeparado[0].substring(i,i+i).compareTo("I")==0 ||
                    nombreSeparado[0].substring(i,i+i).compareTo("O")==0 ||
                    nombreSeparado[0].substring(i,i+i).compareTo("U")==0)
                    
                 curp += nombreSeparado[0].substring(i,i+1);
                 break;
                 
                   
                    
        }
        
        //Primera letra de materno 
        curp += nombreSeparado[1].substring(0,1);
        //Primera letra del nombre
        curp += nombreSeparado[2].substring(0,1);
        
        ////////FECHA////////
        String [] fecha = fechaNacimiento.split("/");
        //año en 2 digitos 
        curp += fecha[2].substring(2);
        //dia en 2 digitos 
        curp += fecha[1];
        //mes en 2 digitos 
        curp += fecha[0];
        
        ////////SEXO///////
        curp += sexoNacimiento;
        
        ////////Entidad///////
        curp += entidadNacimiento;
        
        //////impresion
        return curp;
                
    }
    public String getNombre() {
        
        return null;
        
    }
    public void setNombre (String nombre){
        
    }
    
    public String getFechaNacimiento(){
        
        return null;
        
    }
    
}
