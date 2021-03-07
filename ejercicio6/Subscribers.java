/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author DELL
 */
public class Subscribers {
    public static void main(String[] args) {
        SevenDaySubscriber s= new SevenDaySubscriber(5454);
        WeekdaySubscribers w= new WeekdaySubscribers(6464);
        WeekendSubscribers w2= new WeekendSubscribers(2454);
        
        System.out.println(s.toString());
        System.out.println(w.toString());
        System.out.println(w2.toString());
    }
}
