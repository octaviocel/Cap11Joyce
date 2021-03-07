/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author DELL
 */
public class DemoPhoneCalls {
    public static void main(String[] args) {
        IncomingPhoneCall l= new IncomingPhoneCall("9374574");
        OutgoingPhoneCall l2= new OutgoingPhoneCall(6,"44646461");
        
        l.information();
        l2.information();
    }
}
