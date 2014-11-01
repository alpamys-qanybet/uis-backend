package kz.essc.uis.core.queue;

import java.io.PrintWriter;

import javax.ejb.Stateless;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

@Stateless
public class MailMessageProducer {
	Context ic = null;
	 
    ConnectionFactory cf = null;
 
    Connection connection = null;

    public void send(String login, String password) throws NamingException {
    	 
        ic = new InitialContext();
        cf = (ConnectionFactory) ic.lookup("/ConnectionFactory");

        String destinationName = "java:/queue/mail";
        
        try {
 
            connection = cf.createConnection();
 
            Queue queue = (Queue) ic.lookup(destinationName);
 
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageProducer publisher = session.createProducer(queue);
 
            connection.start();
//            TextMessage message = session.createTextMessage(login + ":"+password);
            
            MapMessage m = session.createMapMessage();
            m.setStringProperty("login", login);
            m.setStringProperty("password", password);
            m.setStringProperty("toAddress", "alpamys.kanibetov@gmail.com");

            // publish the message to the defined Queue
            publisher.send(m);
        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
 
            if (connection != null) {
                try {
                    connection.close();
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
