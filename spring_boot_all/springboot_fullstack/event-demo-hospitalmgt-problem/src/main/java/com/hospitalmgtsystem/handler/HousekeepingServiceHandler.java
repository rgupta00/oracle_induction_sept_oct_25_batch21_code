package com.hospitalmgtsystem.handler;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.hospitalmgtsystem.event.PatientDischargeEvent;

@Component
public class HousekeepingServiceHandler {

    public void cleanAndAssign(String patientId, String patientName) {
        // Prepare the room for the next patient
        System.out.println("Housekeeping Service: Preparing room for next patient after discharge of "
                +patientId+" : "+Thread.currentThread().getName());
    }
}
