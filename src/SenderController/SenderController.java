/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SenderController;

/**
 *
 * @author igor
 */
import SenderModel.*;
import SenderView.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SenderController {
    //public Interface view = new Interface();
    private sendMail model = new sendMail();
    //private SettingsWindow settings = new SettingsWindow();
    private ActionListener actionListener;
    

    public void StartApplication(){
        Interface run = new Interface();
        run.setVisible(true);
        //view.setVisible(true);
    }
  /*
    Reading user from a given list
   */    
    public void readEmailList(){
        try{
      File adressesList = new File("/home/igor/Documents/customers/newList04_2015/MyEmail");
      Scanner sc = new Scanner(adressesList);
      while(sc.hasNext()){
          String email = sc.next();
      }
        }catch(FileNotFoundException e){
            e.printStackTrace();
	
    }    
}
public void checkHeader(){
    Interface view = new Interface();
 actionListener = new ActionListener() {
      public void actionPerformed(ActionEvent event){
             String header = view.getHeaderValue();
		if(model.checkHeaderEmpty(header)){
                    view.setHint("Введите заголовок");
                }else{
                    model.setHeader(header);
             }
         }
};
 view.ButtonClicked().addActionListener(actionListener);
 
   }

public void setSettings(){
    SettingsWindow settings = new SettingsWindow();
    //actionListener = new ActionListener(){
        //public void actionPerformed(ActionEvent event){
           model.setAuthentificatio(settings.getSettings(0), settings.getSettings(1), settings.getSettings(3), "mail.ru", settings.getSettings(4) );
  };
   
 
public void close(){
    System.exit(0);
}
}

