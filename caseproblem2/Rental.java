/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblem2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author DELL
 */
public class Rental {

    private final static Integer HORA = 60;
    private final static Integer RENTAHORA = 40;
    
    private String contrato;
    private Integer horas;
    private Integer min;
    private Integer precio;
    private String telefono;
    private Equipment equipo;

    public Rental() {
        this.setContrato("A000");
        this.setHorasAndMin(0);
    }

    public Rental(String contrato, Integer min, Integer tipo) {
        this.setContrato(contrato);
        this.setHorasAndMin(min);
        setEquipo(tipo);
    }
    
    public Equipment getEquipo(){
        return equipo;
    }
    
    public void setEquipo(Integer tipo){
        if(tipo==5 || tipo==6){
            this.equipo= new EquipmentWithoutLesson(tipo);
        }else{
            this.equipo= new EquipmentWithLesson(tipo);
        }
    }

    public void setContrato(String contrato) {
        if (contrato.length() > 4 || contrato.length() < 0) {
            this.contrato = "A000";
        } else if (!Character.isLetter(contrato.charAt(0))) {
            this.contrato = "A000";
        } else if (!Character.isUpperCase(contrato.charAt(0))) {
            this.contrato = contrato.toUpperCase();
        } else {
            this.contrato = contrato;
        }
    }
    
    public void setTelefono(String telefono){
        String tel="";
        for (int i = 0; i < telefono.length(); i++) {
            if(Character.isDigit(telefono.charAt(i))){
                tel+=telefono.charAt(i);
            }
        }
        if(tel.length()!=10){
            this.telefono = "(000) 000-0000";
        }else{
            this.telefono=convParentesis(tel);
        }
    }
    
    private String convParentesis(String tel){
        String part1= tel.substring(0, 3);
        String part2= tel.substring(3, 6);
        String part3= tel.substring(6, 10);
        return "("+part1+")"+part2+"-"+part3;
    }

    public void setHorasAndMin(Integer min) {
        this.horas = min/HORA;
        this.min = min;
        if (min <= 40) {
            this.precio = (this.horas * RENTAHORA) + this.min;
        } else {
            this.precio = (this.horas * RENTAHORA) + RENTAHORA;
        }
    }
    
    public static void masLargo(Rental r1, Rental r2) {
        if (r1.getHoras().equals(r2.getHoras())) {
            if (r1.getMin().equals(r2.getMin())) {
                System.out.println("Los tiempos son iguales");
                r1.mostrar();
            } else if (r1.getMin() > r2.getMin()) {
                System.out.println("El mas largo es:");
                r1.mostrar();
            } else {
                System.out.println("El mas largo es:");
                r2.mostrar();
            }
        } else if (r1.getHoras() > r2.getHoras()) {
            System.out.println("El mas largo es:");
            r1.mostrar();
        } else {
            System.out.println("El mas largo es:");
            r2.mostrar();
        }
        System.out.println();
    }

    public String getContrato() {
        return contrato;
    }

    public Integer getHoras() {
        return horas;
    }

    public Integer getMin() {
        return min;
    }

    public Integer getPrecio() {
        return precio;
    }
    
    public String getTelefono(){
        return telefono;
    }

    public void mostrar() {
        System.out.println(String.format("Renta No. %s\nHoras: %d\nMinutos: %d\nCosto total: $%d"
                + "\nTelefono de contacto: %s", this.contrato, this.horas, this.min, this.precio,this.telefono));
    }

    public static void logo() {
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("<   Sammy’s Seashore   <");
        System.out.println("< Rents Beach Equipmen <");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<");
    }

    public void rentas(){
        for (int i = 0; i < this.horas; i++) {
            System.out.println("Coupon good for 10 percent off next rental");
        }
    }
    
    public static void ordenar(Rental[] e, Integer orden) {
        switch (orden) {
            case 1:
                Rental.ordenarContrato(e);
                break;
            case 2:
                Rental.ordenarPrecio(e);
                break;
            default:
                break;
        }
    }

    private static void ordenarContrato(Rental[] e) {
        ArrayList r = new ArrayList();
        for (int i = 0; i < e.length; i++) {
            r.add(e[i].getContrato());
        }
        Collections.sort(r);
        for (int i = 0; i < r.size(); i++) {
            System.out.println(r.get(i));
        }
    }

    private static void ordenarPrecio(Rental[] e) {
        ArrayList r = new ArrayList();
        for (int i = 0; i < e.length; i++) {
            r.add(e[i].getPrecio());
        }
        Collections.sort(r);
        for (int i = 0; i < r.size(); i++) {
            System.out.println(r.get(i));
        }
    }

 
}
