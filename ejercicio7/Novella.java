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
public class Novella extends Story{
    private Integer pas;
    
    public void setPaginas(Integer e){
        if(e>=50 && e<=100){
            this.pas=e;
        }else if(e<50){
            this.pas=50;
            super.setMensaje("A este libro le faltan "+(pas-e)+" paginas");
        }else{
            this.pas=100;
            super.setMensaje("A este libro le sobran "+(e-pas)+" paginas");
        }
    }

    @Override
    public Integer setPaginas() {
        return  pas;//To change body of generated methods, choose Tools | Templates.
    }
    
}
