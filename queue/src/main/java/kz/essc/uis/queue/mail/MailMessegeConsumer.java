package kz.essc.uis.queue.mail;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.mail.MessagingException;

import kz.essc.uis.mail.MailBean;

@MessageDriven(activationConfig = {@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
@ActivationConfigProperty(propertyName = "destination", propertyValue = "java:/queue/mail"),
@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge")})
public class MailMessegeConsumer implements MessageListener {
 
	@Inject
	MailBean mailBean;
	
    public MailMessegeConsumer() {}

    public void onMessage(Message message) {
    	try {
    		if (message instanceof MapMessage) {
    			String toAddress = message.getStringProperty("toAddress");
    			String subject = message.getStringProperty("subject");
    			String content = message.getStringProperty("content");

/*				System.out.println("toAddress " + toAddress);
    			System.out.println("subject " + subject);
				System.out.println("content " + content);*/
				
				mailBean.send(toAddress, subject, content);
    		}
    	} catch (JMSException | MessagingException e) {
            e.printStackTrace();
        }
    }
}