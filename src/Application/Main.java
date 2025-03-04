/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

import Library.*;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args){
        Front frontFrame = new Front();
        frontFrame.setVisible(true);
        frontFrame.pack();
        frontFrame.setLocationRelativeTo (null);
        Sell sell = new Sell();
        Lot [] lots = new Lot[20];
        
        //System.out.print("Lot index: " + lots[1].getPrice());
    }
}
