/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SenderCollection;
import SenderController.*;
import javax.swing.SwingUtilities;
/**
 *
 * @author igor
 */
public class SenderMain {
    
    public static void main(String args[]){
        
            SenderController controller =  SenderController.getController();
        controller.StartApplication();
    
}}
