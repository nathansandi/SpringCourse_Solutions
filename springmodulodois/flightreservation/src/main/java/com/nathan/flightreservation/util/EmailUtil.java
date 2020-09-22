package com.nathan.flightreservation.util;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.nathan.flightreservation.services.ReservationServiceImpl;

@Component
public class EmailUtil {
	
	
	@Value("${com.nsandi.flightreservation.itinerary.emailsub}")
	private String ITINERARY_FOR_YOUR_FLIGHT;
	@Autowired
	private JavaMailSender sender;
	

	public void sendItinerary(String to, String filepath) {
	
		MimeMessage message = sender.createMimeMessage();
		
		try {
			MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(message,true);
			mimeMessageHelper.setTo(to);
			mimeMessageHelper.setSubject(ITINERARY_FOR_YOUR_FLIGHT);
			mimeMessageHelper.setText("Please find your itinerary attached.");
			
			mimeMessageHelper.addAttachment("Itinerary", new File(filepath));
			sender.send(message);
		
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
