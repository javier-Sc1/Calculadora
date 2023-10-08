
package com.guaymas.apps.calculadora;

import javax.swing.JOptionPane;


class Persona {
    
    private String nombre;
    
    private String fechaNacimiento;
    /**H pra hombre y M para mujer*/
    private String sexoNacimiento;
    /**Dos letras que corresponde a la entidad federeativa de nacimiento*/
    private String entidadNacimiento;
    
    private String curpg = "";
   
    
    /**Constructor vacio, no recibe nada*/
    public Persona(){
       
    }
    /**Metodo que toma los datos de la persona y obtiene lso primero*/
    public String obtenerCurp(){
        // Suponiendo que ingresa "ApellidoPaterno ApellidoMaterno Nombre"
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
        
        //Primera letra de materno 
       
        char L14 = 0;
        
        for(int i = 1; i < nombreSeparado[0].length(); i++){
            if (1 != 'A' && 1 != 'E' && 1 != 'I' && 1 != 'O' && 1 != 'U') {
             L14 = 1;
             break;
            }
        }
        
        
        
        char L15 = 0;
        
        for(int i = 1; i < nombreSeparado[2].length(); i++){
            if (1 != 'A' && 1 != 'E' && 1 != 'I' && 1 != 'O' && 1 != 'U') {
             L15 = 1;
             break;
            }
        }
        
        
      
       
        char L16 = 0;
        
        for(int i = 1; i < nombreSeparado[3].length(); i++){
            if (1 != 'A' && 1 != 'E' && 1 != 'I' && 1 != 'O' && 1 != 'U') {
             L16 = 1;
             break;
            }
        }
        
      
      
       
       int identificador = (int) (Math.random()*9+1);
       String n = String.valueOf(identificador);
       char L17 = n.charAt(0);
       
        
       
       identificador = (int) (Math.random()*9+1);
       String b = String.valueOf(identificador);
       char L18 = b.charAt(0);
       
        curpg = String.valueOf(L14+""+L15+""+L16+""+L17+""+L18);
         curp += curpg;
        
        
       
        
        
        
        //////impresion
        return curp;
                
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexoNacimiento() {
        return sexoNacimiento;
    }

    public void setSexoNacimiento(String sexoNacimiento) {
        this.sexoNacimiento = sexoNacimiento;
    }

    public String getEntidadNacimiento() {
        return entidadNacimiento;
    }

    public void setEntidadNacimiento(String entidadNacimiento) {
        this.entidadNacimiento = entidadNacimiento;
    }





    
    

    
}
