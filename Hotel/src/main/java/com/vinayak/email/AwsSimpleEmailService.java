package com.vinayak.email;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class AwsSimpleEmailService {

	 static final String FROM = "vinayakdeshpande681997@gmail.com";
	 static final String TO = "vinayak.parthiv@gmail.com";
	 static final String SMTP_USERNAME = "AKIASX2UXU4FVOHWHQX5";
	 static final String SMTP_PASSWORD = "BJqT9sTvnJwUiRDDx6CayYhEwn2o1f54Q/ZH2ScISV7A";
	 static final String CONFIGSET = "configurationSet1";
	  static final String HOST = "email-smtp.us-west-2.amazonaws.com";
	  static final String FROMNAME ="vinayak";
	    
	    static final int PORT = 587;
	    
	    static final String SUBJECT = "Success";
	    
	    static final String BODY = String.join(
	    	    System.getProperty("line.separator"),
	    	    "<h1>Hello Mr/Mrs</h1>",
	    	    "<p>Booking Successfull"
	    	      
	    	);
	    
	    
   public void awsMail() throws Exception {
	   Properties props = System.getProperties();
   	props.put("mail.transport.protocol", "smtp");
   	props.put("mail.smtp.port", PORT); 
   	props.put("mail.smtp.starttls.enable", "true");
   	props.put("mail.smtp.auth", "true");

       // Create a Session object to represent a mail session with the specified properties. 
   	Session session = Session.getDefaultInstance(props);

       // Create a message with the specified information. 
       MimeMessage msg = new MimeMessage(session);
       msg.setFrom(new InternetAddress(FROM,FROMNAME));
       msg.setRecipient(Message.RecipientType.TO, new InternetAddress(TO));
       msg.setSubject(SUBJECT);
       msg.setContent(BODY,"text/html");
       
       // Add a configuration set header. Comment or delete the 
       // next line if you are not using a configuration set
       msg.setHeader("X-SES-CONFIGURATION-SET", CONFIGSET);
           
       // Create a transport.
       Transport transport = session.getTransport();
                   
       // Send the message.
       try
       {
           System.out.println("Sending...");
           
           // Connect to Amazon SES using the SMTP username and password you specified above.
           transport.connect(HOST, SMTP_USERNAME, SMTP_PASSWORD);
       	
           // Send the email.
           transport.sendMessage(msg, msg.getAllRecipients());
           System.out.println("Email sent!");
       }
       catch (Exception ex) {
           System.out.println("The email was not sent.");
           System.out.println("Error message: " + ex.getMessage());
       }
       finally
       {
           // Close and terminate the connection.
           transport.close();
       }
   }
   }

