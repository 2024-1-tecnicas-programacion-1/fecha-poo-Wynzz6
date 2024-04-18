package com.mycompany.fecha.poo;

public class Fecha {
    int dia;
    int mes;
    int ano;
    
    public Fecha(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public String fechaCorta() {
        return dia + "/" + mes + "/" + ano; 
    }
    
    public boolean validarFecha() {
        if (mes < 1 && mes > 12) {
            return false; 
        }
        else{
        if (dia < 1 && dia > 31){
            return false;
        }
            return true;
        }
        }
    public String mesLetra(){
        String[] meses = {"enero", "febrero", "marzo", "abril" , "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        return meses[mes-1];
        
    }
    public String fechaLarga(){
        return dia + "de" + mesLetra() + "del" + ano; }
    
    
    }


    
       
  
    
       
        
    

     
       
  
   
       
        
    

    