package com.ar.ibb.jmsRecivers;

import com.ar.ibb.jmsModel.Location;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @JmsListener(destination = "arTopic", containerFactory = "jmsFactory")
    public void receiveMessage(Location location) {
        System.out.println("Received <" + location.getId() +" : "+  location.getLocation()+ ">");
    }

}