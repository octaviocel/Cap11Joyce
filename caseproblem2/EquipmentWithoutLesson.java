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
public class EquipmentWithoutLesson extends Equipment{

    public EquipmentWithoutLesson(Integer equipo) {
        super(equipo);
        if(equipo==5 || equipo==6){
            super.setEquipo(equipo);
        }else{
            super.setEquipo(7);
        }
        
    }

    @Override
    public void lessonPolicy() {
        System.out.println("Estos equipos no requieren leccion"); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
