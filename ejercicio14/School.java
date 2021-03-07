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
public class School extends Building{
    private Integer aulas;
    private String grado;

    public School(Integer aulas, String grado, Integer pisoscuadrados, Integer pisos) {
        super(pisoscuadrados, pisos);
        this.aulas = aulas;
        this.grado = grado;
    }

    public Integer getAulas() {
        return aulas;
    }

    public void setAulas(Integer aulas) {
        this.aulas = aulas;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
    
    @Override
    public String toString(){
        return "Escuela de "+super.getPisos()+" pisos, espacio "+super.getPisoscuadrados()+" metros cuadrados\nTiene "+getAulas()+" aulas y grado de "+getGrado();
    }
}
