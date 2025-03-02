/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Application;

import Library.*;
import static java.lang.System.out;
import javax.swing.JTextField;

/**
 *
 * @author Avriy
 */
public class LoginAndSignup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        
        SignUp signup = new SignUp();
        Account acc = new Account();
        Account [] accs = new Account[5];
        
        //Just testing if name passes
        System.out.print("Account: " + accs[acc.accountNum]);
    }
    
}
