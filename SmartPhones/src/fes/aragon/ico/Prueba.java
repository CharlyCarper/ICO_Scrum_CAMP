/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.ico;

/**
 *
 * @author PC
 */
public class Prueba {

    public static void main(String[] args) {
        Android AD = new Android();
        iPhone iP = new iPhone();
        WindowsPhone WP = new WindowsPhone();
        AD.getDatos();
        iP.getDatos();
        WP.getDatos();
    }

}
