/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

/**
 *
 * @author DELL
 */
public class House extends Building{
    private Integer dormitorios;
    private Integer baños;

    public House(Integer dormitorios, Integer baños, Integer pisoscuadrados, Integer pisos) {
        super(pisoscuadrados, pisos);
        this.dormitorios = dormitorios;
        this.baños = baños;
    }

    public Integer getDormitorios() {
        return dormitorios;
    }

    public void setDormitorios(Integer dormitorios) {
        this.dormitorios = dormitorios;
    }

    public Integer getBaños() {
        return baños;
    }

    public void setBaños(Integer baños) {
        this.baños = baños;
    }
    
    @Override
    public String toString(){
        return "Casa de "+super.getPisos()+" pisos, espacio "+super.getPisoscuadrados()+" metros cuadrados\nTiene "+getDormitorios()+" dormitorios y "+getBaños()+" baños";
    }
}
