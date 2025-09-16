package bisinessLayer.EmailSender.impl;

import bisinessLayer.EmailSender.EmailBo;
import bisinessLayer.SuperBo;

import java.util.Properties ;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailBoImpl implements EmailBo {
    public Boolean sendmail(String email,String emailBody){

        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");


        final String username = "ptheekshana289@gmail.com";
        final String password = "iltc mpip upjf pgve";

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);

            message.setFrom(new InternetAddress("ptheekshana289@gmail.com"));

            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));

            message.setSubject("Clothify Store App OTP ");

            message.setText(emailBody);

            Transport.send(message);

        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return true;
    }
}
