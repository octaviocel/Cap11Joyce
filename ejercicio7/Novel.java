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
public class Novel extends Story{
    private Integer pas;
    
    public void setPaginas(Integer e){
        if(e>100){
            this.pas=e;
        }else{
            this.pas=101;
            super.setMensaje("A este libro le faltan "+(pas-e)+" paginas");
        }
    }

    @Override
    public Integer setPaginas() {
        return  pas;//To change body of generated methods, choose Tools | Templates.
    }
    
}
