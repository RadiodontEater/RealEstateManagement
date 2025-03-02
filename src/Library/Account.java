/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;
import Application.*;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class Account {
    SignUp signup = new SignUp();
    
    public JTextField Username;
    private String Email;
    private int Password;
    public static int accountNum;

    

    public void setUsername(JTextField Username) {
        this.Username = Username;
    }
    
    public JTextField getUsername() {
        return Username;
    }

    public String getEmail() {
        return Email;
    }

    public int getPassword() {
        return Password;
    }
    
    
}
