import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class SendMail {

	public static void main(String[] args) {
		
		System.out.println("Started.");
 
		Properties props = new Properties();
		
		props.setProperty("mail.host", "smtp.gmail.com");
		props.setProperty("mail.smtp.port", "587");
		props.setProperty("mail.smtp.auth", "true");
		props.setProperty("mail.smtp.starttls.required", "true");
		
		Authenticator auth = new Authenticator() {
			protected  PasswordAuthentication  getPasswordAuthentication() {
				return new PasswordAuthentication("j4sysiak@gmail.com", "Warszawa5584");
			}
		};
		
		Session session = Session.getDefaultInstance(props, auth);
		
		Message msg = new MimeMessage(session);
		
		try {
			msg.setSubject("test");
			msg.setText("ddddddddddddddddddd");
			msg.setFrom(new InternetAddress("j4sysiak@gmail.com", "Jacek"));
			msg.setRecipient(Message.RecipientType.TO, new InternetAddress("jaceksysiak@wp.pl"));
			
			Transport.send(msg);
			
		} catch (MessagingException | UnsupportedEncodingException e) {
	 
			e.printStackTrace();
		}
		
		System.out.println("Finished.");
	}

}
















































  