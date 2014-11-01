package kz.essc.uis.core.queue;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import javax.mail.MessagingException;

import kz.essc.uis.core.MailBean;
 
/**
 * Message-Driven Bean implementation class for: MDBSample- This is for Consume the Queue
 */
@MessageDriven(activationConfig = {@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
@ActivationConfigProperty(propertyName = "destination", propertyValue = "java:/queue/mail"),
@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge")})
public class MessegeConsumer implements MessageListener {
 
	@Inject
	MailBean mailBean;
	
    /**
     * Default constructor.
     */
    public MessegeConsumer() {
 
    }
 
    /**
     * @see MessageListener#onMessage(Message)
     */
    public void onMessage(Message message) {
    	try {
    		if (message instanceof MapMessage) {
    			String login = message.getStringProperty("login");
    			String password = message.getStringProperty("password");
    			String toAddress = message.getStringProperty("toAddress");
    			
    			System.out.println("login " + login);
				System.out.println("password " + password);
				System.out.println("toAddress " + toAddress);
				
				String content = "<h2>Admin! Notification</h2>";
				content += "<p>New user has been added to university portal</p>";
				content += "<p>Login: " + login + "</p>";
				content += "<p>Password: " + password + "</p><br/>";
				content += "Please, notify him/her to login, change password.";
				
				mailBean.send(toAddress, "SDU University Portal. New user", content);
		
    		}
    	} catch (JMSException | MessagingException e) {
            e.printStackTrace();
        }
 /*
        TextMessage tm = (TextMessage) message;
        try {
            System.out.println("Received message is ==========> " + tm.getText());
            
            String msg = tm.getText();
            String login = msg.substring(0, msg.indexOf(':'));
            String password = msg.substring(msg.indexOf(':')+1);
            System.out.println("login " + login);
            System.out.println("password " + password);
            
            String content = "<h2>Admin! Notification</h2>";
			content += "<p>New user has been added to university portal</p>";
			content += "<p>Login: " + login + "</p>";
			content += "<p>Password: " + password + "</p><br/>";
			content += "Please, notify him/her to login, change password.";
			
			mailBean.send("alpamys.kanibetov@gmail.com", "SDU University Portal. New user", content);
        } catch (JMSException | MessagingException e) {
            e.printStackTrace();
        }
*/ 
    }
 
}