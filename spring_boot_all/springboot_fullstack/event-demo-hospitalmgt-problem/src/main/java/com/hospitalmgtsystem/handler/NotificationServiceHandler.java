package com.hospitalmgtsystem.handler;

import org.springframework.stereotype.Component;

@Component
public class NotificationServiceHandler {

    public void notifyPatients(String patientId, String patientName) {
        // Send discharge notification
        System.out.println("Notification Service: Sending discharge notification for patient "
                +patientId+" : "+Thread.currentThread().getName());
    }
}
