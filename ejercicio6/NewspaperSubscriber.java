/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author DELL
 */
public abstract class NewspaperSubscriber {
    private Integer direccionPostal;
    private Double tarifa;

    public NewspaperSubscriber() {
        this.tarifa=setTarifa();
    }
       

    public Integer getDireccionPostal() {
        return direccionPostal;
    }

    public void setDireccionPostal(Integer direccionPostal) {
        this.direccionPostal = direccionPostal;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public abstract Double setTarifa();
    
    public void equals(NewspaperSubscriber a){
        if(this.direccionPostal==a.getDireccionPostal()){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son diferentes");
        }
    }
            
            
}
