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
public abstract class Story {
    public final static Integer LIMITE1=50;
    public final static Integer LIMITE2=100;
    
    private String libro;
    private String autor;
    private Integer paginas;
    private String mensaje;
    
    public Story(){
        this.paginas=setPaginas();
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public abstract Integer setPaginas();
    
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    @Override
    public String toString(){
        return String.format("Publicamos la historia %s de autos %s\nCon %d paginas\n %s", getLibro(),getAutor(),getPaginas(),getMensaje());
    }
}
