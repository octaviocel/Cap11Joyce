/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author DELL
 */
public class ShortStory extends Story {

    private Integer pas;

    public void setPaginas(Integer e) {
        if (e <50 ) {
            this.pas = e;
        } else {
            this.pas = 49;
            super.setMensaje("A este libro le sobran " + (e - pas) + " paginas");
        }
    }

    @Override
    public Integer setPaginas() {
        return pas;//To change body of generated methods, choose Tools | Templates.
    }

}
