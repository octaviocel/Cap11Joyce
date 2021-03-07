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
public class EquipmentWithLesson extends Equipment{

    public EquipmentWithLesson(Integer equipo) {
        super(equipo);
        if(equipo==0 || equipo==1|| equipo==2 || equipo==3 || equipo==4){
            super.setEquipo(equipo);
        }else{
            super.setEquipo(7);
        }
    }

    @Override
    public void lessonPolicy() {
        System.out.println("Estos cursos rquiere una leccion antes del aquiles y tiene un costo extra de $27");; //To change body of generated methods, choose Tools | Templates.
    }
    
}
