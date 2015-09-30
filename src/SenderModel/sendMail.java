package SenderModel;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Properties;
import java.util.Scanner;
import SenderView.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

public class sendMail {
	/*
	 * This method is used for multiple attachments in one session
	 */
	private static BodyPart messagePart;
        	
	private static BodyPart addAttachement(String file, String tag) throws MessagingException{
		messagePart = new MimeBodyPart();
		DataSource source = new FileDataSource(file);
		messagePart.setDataHandler(new DataHandler(source));
		messagePart.setFileName(source.getName());
		messagePart.setHeader("Content-ID", tag);
		return messagePart;
	}
	public void Model() throws AddressException, MessagingException {
	      // Recipient's email ID needs to be mentioned.
	      //String to = "igor.littig@gmail.com";//change accordingly

	      // Sender's email ID needs to be mentioned
	      String from = "Art-Mebel01<zakaz.artmebel01@mail.ru>";//change accordingly
	      final String username = "zakaz.artmebel01";//change accordingly
	      final String password = "QWE789qwe";//change accordingly

	      String host = "smtp.mail.ru";

	      Properties props = new Properties();
	      props.put("mail.smtp.auth", "true");
	      props.put("mail.smtps.starttls.enable", "true");
	      props.put("mail.smtp.ssl.enable", "true");
	      props.put("mail.smtp.host", host);
	      props.put("mail.smtp.port", "465");

	      // Get the Session object.
	      Session session = Session.getInstance(props,
	      new javax.mail.Authenticator() {
	         protected PasswordAuthentication getPasswordAuthentication() {
	            return new PasswordAuthentication(username, password);
	         }
	      });

	      try {
	         // Create a default MimeMessage object.
	         Message message = new MimeMessage(session);

	         // Set From: header field of the sender.
	         message.setFrom(new InternetAddress(from));
	         // Set Subject: header field
	       message.setSubject("Новое поступление шурупов SPAX ART-Мебель01 !");
	        
	       // Now set the actual parted message message
	         BodyPart messagePart = new MimeBodyPart();
	         String htmlText = "<H3>Новое поступление шурупов SPAX!</H3><img src=\"cid:image\">"
	         		+ "<br>"
	        		+ "По всем дополнительным вопросам звоните по телефонам"
	         		+ ":+7 (727) 268-49-11 392-93-11 392-93-14"
	         +" или читайте на сайтах www.artmebel.kz и www.artmebel01.kz";
			 messagePart.setContent(htmlText, "text/html; charset=UTF-8");
			//Setting the multipart message
			 Multipart multipart = new MimeMultipart("mixed");
			 multipart.addBodyPart(messagePart);
			 //Setting attachment
			 multipart.addBodyPart(addAttachement("/home/igor/Pictures/newsLetting/SpaxPromotion.jpg","<image>"));
			 //multipart.addBodyPart(addAttachement("/home/igor/Pictures/newsLetting/Samet.jpg","<image2>"));
			 //Set the message content
			 message.setContent(multipart);
			 try{
		File  file1 = new File("/home/igor/Documents/customers/newList04_2015/CustomersAll.txt");
				 //File file1 = new File("/home/igor/Documents/customers/newList04_2015/MyEmail");
			Scanner sc = new Scanner(file1);
			PrintWriter write = new PrintWriter(new File("/home/igor/Documents/customers/Errors"));
			while(sc.hasNext()){
				String email = sc.next();
				// Set To: header field of the recepient.
		         message.setRecipients(Message.RecipientType.TO,
		         InternetAddress.parse(email));
		        // Send message
		         try{
		         Transport.send(message);
		         System.out.println("Message was sent to "+email);
		        }catch(SendFailedException e){
		        	 System.out.println("Message was not sent to " + email);
		        	 e.printStackTrace(write);
		         }
	           }
			write.close();
			 }catch(FileNotFoundException e){
				 e.printStackTrace();
			 }
			 
			 System.out.println("Done");
	         
	      } catch (MessagingException e) {
	    	  e.printStackTrace();
	     }
	    		      
	   }
       
        private Session session;
        private String username = "igor.littig";
        private String password = "sssl072011";
        private Properties props;
        
        /*
        *Subject string validation
        */    
        public Boolean checkHeaderEmpty(String emailHeader ){
           Boolean result = null;
            if(emailHeader !=null && !emailHeader.isEmpty())
                result = true;
           return result;
        }
        
        /*
        Setting subject of the letter
        */
        
        /*
        Setting authentification process
        */
        public void setAuthentificatio(String username, String password, String host, String mailServer, String port){
        this.username = username;
        this.password = password;
        this.props = new Properties();
        props.put(mailServer+".smtp.auth", "true");
	props.put(mailServer+".smtps.starttls.enable", "true");
	props.put(mailServer+".smtp.ssl.enable", "true");
	props.put(mailServer+".smtp.host",host);
	props.put(mailServer+".smtp.port", port);
        }
        
        /*Test method for checking connection */
        public void setProperties(){
            Properties props2 = new Properties();
            props2.put("mail.smtp.auth","true");
            props2.put("mail.smtp.starttls.enable", "true");
            props2.put("mail.smtp.ssl.enable", "true");
            props2.put("mail.smtp.host", "smtp.mail.ru");
            props2.put("mail.smtp.port", "465");
           
            this.props = props2;
            Authenticator aut;
                  }
              
        public void setSession(){
            final String username = "igor.littig";
            final String password ="sssl072011";
            
            this.session=Session.getInstance(this.props, new javax.mail.Authenticator() {
                
                  protected PasswordAuthentication getPaswordAuthentification(){
                      
                      return new PasswordAuthentication(username,password);
                  }
            });
        }
        /*Probably will neve be used*/
        public Session getSession(){
            return this.session;
        } 
        
        public void sendMessage(String emailHeader, String content, String to){
                    
         //session is declared during authentification part   
        Message message = new MimeMessage(this.session);
        try{
        message.setFrom(new InternetAddress("Igor Test<igor.littig@mail.ru>"));
        }   catch (MessagingException ex) {
               System.out.print("Something wrong with adress");
               ex.printStackTrace();
            }
        try{
        message.setSubject(emailHeader);
        }catch(MessagingException e){
            e.printStackTrace();
        }
        BodyPart messagepart = new MimeBodyPart();
            try {
                messagepart.setContent(content, "text/html; charset=UTF-8");
            } catch (MessagingException ex) {
                System.out.println("Something wrong with content");
                ex.printStackTrace();
            }
            Multipart multipart = new MimeMultipart("mixed");
            try {
                multipart.addBodyPart(messagepart);
            } catch (MessagingException ex) {
                //Logger.getLogger(sendMail.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Wrong with bodypart adding");
                ex.printStackTrace();
            }
            try {
                message.setContent(multipart);
            } catch (MessagingException ex) {
                //Logger.getLogger(sendMail.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Wrong with setting multipart content");
            ex.printStackTrace();
            }
            try {
                message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            } catch (MessagingException ex) {
                //Logger.getLogger(sendMail.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Wrong with recepient");
            ex.printStackTrace();
          }
            try {
                Transport.send(message, username, password);
            } catch (MessagingException ex) {
                //Logger.getLogger(sendMail.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("wrong with sending");
            ex.printStackTrace();
            }
        }
        
  }
