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
    private sendMail model;
    private File picture;
    private ActionListener actionListener;
    private String pathToCustomers;
    private Interface view;
    private sendTracker2 tracker;
    private static SenderController controller = null;
    private boolean sentOrNot;
    
    private SenderController(){};

    public void StartApplication(){
        model = new sendMail();
        view = new Interface();
        view.setVisible(true);
    }
 
    public void trackerInitialize(){
        tracker = new sendTracker2();
        tracker.setVisible(true);
    }
    
    public void addToTracker(String adress){
        tracker.addSended(adress);
    }
  
    public void setPathToCustomers(String path){
        view.setPathCustomers(path);
    }
    
    public String getPathToCustomers(){
        return pathToCustomers;
    }
public void setPicture(File picture){
    this.picture = picture;
}    

/*Method for returning path of the picture*/
public String getPicture(){
    return this.picture.getAbsolutePath();
}
public void addImageTag(){
    view.addPictureText();
}
public void setSettings(String sender, String username, String password, String host, String mailServer, 
        String port){
model.setAuthentificatio(sender, username, password, host, mailServer, port);
model.setSession();
    
  };
 public void addToList(final String add ){
     
            tracker.addSended(add);
  }
public void send(String subject, String content, String recepient){
    model.setMessage(subject, content, recepient);
    model.readRecepientsAndSend(recepient);
}
public boolean getSentOrNot(){
    return sentOrNot;
}

public void setSentOrNot(boolean sentOrNot){
    this.sentOrNot = sentOrNot;
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

