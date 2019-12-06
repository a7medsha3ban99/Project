/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bugtrackingsystem;

import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*;

public class Employee {
    public void SendEmail(){
        
        String destinationEmail = "DeveloperMaialFromDataBase@gmail.com"; 
        String senderEmail= "yanicha93@gmail.com";
        String host= "localhost";
        Properties props=System.getProperties();
        props.put("mail.smtp.auth",host);
        Session sess=Session.getDefaultInstance(props);

        try {
            MimeMessage message = new MimeMessage(sess);
            message.setFrom(new InternetAddress(senderEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(destinationEmail));
            message.setSubject("Hello");
            message.setText("Hey, ignore this email, this is just an example");
            Transport.send(message);
            System.out.println("Sent Successfully");
        } 
        catch (Exception e) {
            System.out.println("Email Was't Sent ");
        }

        
        
    
    
    
    
    }
    
}
