/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author DELL
 */
public class Fiction extends Book{

    public Fiction(String titulo) {
        super(titulo);
        setPrice();
    }
    

    @Override
    public Double setPrice() {
        return 24.99; //To change body of generated methods, choose Tools | Templates.
    }
    
}
