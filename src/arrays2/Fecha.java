/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays2;

/**
 *
 * @author dam
 */
public class Fecha {

    int dia;
    int mes;
    int anno;

    static int[] diasMes = {31, 28, 31, 30, 31, 31, 31, 30, 31, 31, 30, 31, 30, 31};

    public Fecha() {

    }

    public Fecha(int dia, int mes, int anno) {
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
    }
    public boolean comprobarFecha(String fecha){
    String[] resultado;
    boolean correcto=true;
    resultado=fecha.split("/");
    
    try{
     dia= Integer.parseInt(resultado[0]);
     mes= Integer.parseInt(resultado[1]);
     anno=Integer.parseInt(resultado[2]);
    }
    catch(NumberFormatException ex){
    correcto=false;
    }
    return correcto;
    }
    }
