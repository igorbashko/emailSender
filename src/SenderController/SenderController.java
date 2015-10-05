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
    private String pathToCustomers;
    private Interface view;
    private sendTracker2 tracker;
    private static SenderController controller = null;
    
    private SenderController(){};

    public void StartApplication(){
        //Interface run = new Interface();
        view = new Interface();
        //run.setVisible(true);
        view.setVisible(true);
    }
 
    public void trackerInitialize(){
        tracker = new sendTracker2();
        tracker.setVisible(true);
    }
    public void addToTracker(String adress){
        tracker.addSended(adress);
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
    public void setPathToCustomers(String path){
        view.setPathCustomers(path);
    }
    
    public String getPathToCustomers(){
        return pathToCustomers;
    }
    
public void checkHeader(){
    final Interface view = new Interface();
 actionListener = new ActionListener() {
      public void actionPerformed(ActionEvent event){
             String header = view.getHeaderValue();
		if(model.checkHeaderEmpty(header)){
                    view.setHint("Введите заголовок");
                }else{
                  //  model.setHeader(header);
                   System.out.println("Check this statement");
             }
         }
};
 view.ButtonClicked().addActionListener(actionListener);
 
   }

public void setSettings(String sender, String username, String password, String host, String mailServer, 
        String port){
    //SettingsWindow settings;
    //String settings[] = new String[5];
    //settings.readSettings();
    //String check = settings.getSettings(0);
       /* model.setAuthentificatio(username, 
                password, host, 
                "mail.ru", port );*/
//model.setProperties();
model.setAuthentificatio(sender, username, password, host, mailServer, port);
model.setSession();
    
  };
 
public void send(String subject, String content, String recepient){
    model.setMessage(subject, content, recepient);
    model.tarckerInitiaize();
    model.readRecepientsAndSend(recepient, "/home/igor/Documents/errors.txt");
}
  public static SenderController getController(){
      if(controller == null){
          controller = new SenderController();
      }
      return controller;
  }
public void setController(SenderController controller){
    this.controller = controller;
}         
 
public void close(){
    System.exit(0);
}
}

