/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author DELL
 */
public class InternationalDivision extends Division{
    private String pais;
    private String idioma;

    public InternationalDivision(String pais, String idioma, String name, Integer account) {
        super(name, account);
        this.pais = pais;
        this.idioma = idioma;
    }
    

    @Override
    public void display() {
        System.out.println(String.format("Nombre: %s\tCuenta No. %d\nPais: %s\tIdioma: %s", super.getName(),super.getAccount(),getPais(),getIdioma())); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPais() {
        return pais;
    }

    public String getIdioma() {
        return idioma;
    }
    
    
}
