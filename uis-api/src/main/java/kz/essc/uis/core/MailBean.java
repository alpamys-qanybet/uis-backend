package kz.essc.uis.core;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@Stateless
public class MailBean {
    @Resource(lookup = "java:jboss/mail/Default")
    private Session mailSession;
    
	public void send(String emailTo, String subject, String content) throws MessagingException {
        MimeMessage m = new MimeMessage(mailSession);
//	            Address from = new InternetAddress("alpamys.kanibetov@gmail.com");
        Address[] to = new InternetAddress[] { new InternetAddress(emailTo) };
//	            m.setFrom(from);
        m.setRecipients(Message.RecipientType.TO, to);
        m.setSubject(subject);
        m.setContent(content, "text/html");
        Transport.send(m);
    }
}