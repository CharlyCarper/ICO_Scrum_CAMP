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
public class WindowsPhone {

    private double version=3;
    private int Ram=1;

    public void getDatos() {
        System.out.println("Windows");
        System.out.printf("Ram:%s%n Version:%s%n", Ram, version);

    }

    public void setDaros(int Ram, int version) {
        this.Ram = Ram;
        this.version = version;
    }

}
