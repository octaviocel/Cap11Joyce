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
public class SevenDaySubscriber extends NewspaperSubscriber{

    public SevenDaySubscriber(Integer postal) {
        super.setDireccionPostal(postal);        
    }

    @Override
    public Double setTarifa() {
        return 4.50;
    }
    
    @Override
    public String toString(){
        return "Direccion postal: "+super.getDireccionPostal()+" esta subscripcion cuesta $"+super.getTarifa();
    }
    
}
