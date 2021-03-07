/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblem2;

/**
 *
 * @author DELL
 */
public abstract class Equipment {
    
    public final static String TIPO[]={"Moto Acuática", "Pontón", "Bote de Remos", "Canoa", 
                                        "Kayak", "Silla de Playa", "Sombrilla", "Otros"};
    public final static Integer RECARGO[]={50,40,15,12,10,2,1,0}  ;
    public final static Integer CLASE=27;
    
    private Integer equipo;
    private String nombre;
    private Integer tarifa;

    public Equipment(Integer equipo) {
        this.equipo = equipo;
        setNombre(equipo);
    }

    public Integer getEquipo() {
        return equipo;
    }

    public void setEquipo(Integer equipo) {
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(Integer nombre) {
        switch(nombre){
            case 0:
                this.nombre=TIPO[0];
                this.tarifa=RECARGO[0]+CLASE;
                break;
            case 1:
                this.nombre=TIPO[1];
                this.tarifa=RECARGO[1]+CLASE;
                break;                
            case 2:
                this.nombre=TIPO[2];
                this.tarifa=RECARGO[2]+CLASE;
                break;
            case 3:
                this.nombre=TIPO[3];
                this.tarifa=RECARGO[3]+CLASE;
                break;
            case 4:
                this.nombre=TIPO[4];
                this.tarifa=RECARGO[4]+CLASE;
                break;
            case 5:
                this.nombre=TIPO[5];
                this.tarifa=RECARGO[5];
                break;
            case 6:
                this.nombre=TIPO[6];
                this.tarifa=RECARGO[6];
                break;
            case 7:
                this.nombre=TIPO[7];
                this.tarifa=RECARGO[7];
                break;
            default:
                this.nombre=TIPO[7];
                this.tarifa=RECARGO[7];
                break;
        }
    }

    public Integer getTarifa() {
        return tarifa;
    }
    
    public abstract void lessonPolicy();
    
}
